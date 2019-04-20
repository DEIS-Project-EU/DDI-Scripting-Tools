function generateAPI(apijson) {	
	
	// Sorts documentation and removes '\r' characters from field names introduced by cod
	ordered = {};
	Object.keys(apijson).sort().forEach(function(key) {
		if(key.indexOf('\r') !== -1)
			key = key.substr(0, key.length);
		ordered[key] = JSON.parse(JSON.stringify(apijson[key], null, '  ').replace("context\\r", "context").replace("comments\\r", "comments").replace("return-type\\r", "return-type"));
	});
	
	// Over each operation API entry
	$.each(ordered, function(key, value){
	
		// Operation name header
		document.write('<div class="opName">' + key + '</div>');
		
			// Box of operation description
			document.write('<div class="op_">');
			
				// Operation prototype construction
				document.write('<div class="opProto">');
					
					// List operation prototype (context optional)
					document.write('operation ' + ("context" in value ? value.context.type : '') + ' ' + key.substr(0, key.indexOf('(')) + '(');
					
					// List operation parameters (optional)
					if("param" in value) {
						if(Array.isArray(value.param)) {
							var paramCount = value.param.length;
							var paramIndex = 0;
							$.each(value.param, function(key, value){
								document.write(value['!value'] + ' : ' + value.type);
								paramIndex++;
								if(paramIndex < paramCount)
									document.write(', ');
							});
						}
						else {
							// Only one parameter
							document.write(value.param['!value'] + ' : ' + value.param.type);
						}
					}
					document.write(')');
					
					// List operation return type (optional)
					if("return-type" in value)
						document.write(' : ' + value['return-type'].type);
				
				// Close <div class="opProto">
				document.write('</div>');
				
				// Description of operation's function and additional comments
				document.write('<div class="comments_">' + value.comments['!text'] + '</div>');
				
				// Context of operation (optional)
				if("context" in value) {
					document.write('<div class="opCtx"> Context: </div>');
					document.write('<div class="opCtx_">' + value.context.type + ("!text" in value.context ? ' - ' + value.context['!text'] : '') + '</div>');
				}
				
				// Return type of operation (optional)
				if("return-type" in value) {
					document.write('<div class="opReturn"> Returns: </div>');
					document.write('<div class="opReturn_">' + value['return-type'].type + ("!text" in value['return-type'] ? ' - ' + value['return-type']['!text'] : '') + '</div>');
				}
				
				// Operation parameters (optional)
				if("param" in value) {
					document.write('<div class="params"> Parameters:</div>');
					document.write('<div class="params_">');
					if(Array.isArray(value.param)) {
						$.each(value.param, function(key, value){
							document.write('<div class="param">' + value['!value'] + ("!text" in value ? ' - ' + value['!text'] : '') + '</div>');
						});
					} else {
						document.write('<div class="param">' + value.param['!value'] + ("!text" in value.param ? ' - ' + value.param['!text'] : '') + '</div>');
					}
					document.write('</div>');
				}
			
			// Close <div class="op_">
			document.write('</div>');
		
		// Horizontal break splits each operation API entry
		document.write('<hr>');
	});
}