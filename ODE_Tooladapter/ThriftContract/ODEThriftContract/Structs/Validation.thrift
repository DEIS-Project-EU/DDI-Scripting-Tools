struct TDDIValidationResult{
    1: bool ValidationViolationOccurred = false,
    2: list<TDDIValidationViolationMessage> ValidationViolationMessages = []
}

struct TDDIValidationViolationMessage{
    1: string Context = "",
    2: string Message = ""
}

exception TDDIValidationFailedException{
    1: TDDIValidationResult ValidationResult
}