package btc.to;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
@JsonInclude(Include.NON_NULL)
public class AdapterResponse {
	

	private ErrorResponse error;
	private Result result;
	
	
	public ErrorResponse getError() {
		return error;
	}
	public void setError(ErrorResponse errorRes) {
		this.error = errorRes;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result reuslt) {
		this.result = reuslt;
	}
	
	
	
	
}
