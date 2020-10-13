package mx.com.findep.rest.response;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 
 */
@XmlRootElement
@XmlSeeAlso({ Object.class })
public class RestResponse<T> {

	private boolean successful;

	private String functionalMessage;

	private String technicalMessage;

	private String traceId;

	private T payload;

	@XmlAttribute
	public String getTraceId() {
		return traceId;
	}

	public RestResponse() {
		this.traceId = String.valueOf(System.currentTimeMillis() + "-" + Math.round(Math.abs(Math.random()*10000l)));
	}

	public RestResponse(boolean successful, String technicalMessage, String functionalMessage, T payload) {
		this.traceId = String.valueOf(System.currentTimeMillis() + "-" + Math.round(Math.abs(Math.random()*10000l)));
		this.successful = successful;
		this.technicalMessage = technicalMessage;
		this.functionalMessage = functionalMessage;
		this.payload = payload;
	}

	@XmlAttribute
	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	@XmlAttribute
	public String getFunctionalMessage() {
		return functionalMessage;
	}

	public void setFunctionalMessage(String functionalMessage) {
		this.functionalMessage = functionalMessage;
	}

	@XmlAttribute
	public String getTechnicalMessage() {
		return technicalMessage;
	}

	public void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = technicalMessage;
	}

	@XmlAnyElement(lax = true)
	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "RestResponse [successful=" + successful + ", functionalMessage=" + functionalMessage
				+ ", technicalMessage=" + technicalMessage + ", traceId=" + traceId + ", payload=" + payload + "]";
	}

}
