package com.phatng.tutorial.projection.dto;

//import org.springframework.beans.factory.annotation.Value;

public interface BookSlimWithVerId {
	Long getId();

	String getTitle();
	
	String getVerboseCode();
	
	//@Value("#{target.id.toString() + ' ' + target.verboseCode}")
	//String getVerId();
	
	default String getVerId() {
		return getId().toString().concat(" ").concat(getVerboseCode());
	}
}
