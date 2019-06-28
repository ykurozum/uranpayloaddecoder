package com.cisco.japan.as.uran.payloaddecoder;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

public class DecodedPayload {
	/**
	 * EncodedPayload
	 */
	Date time;
	/**
	 * 
	 */
	Date payloadTime;
	/**
	 */
	String payloadString;
	/**
	 * payload
	 * { "protocol": "0c1002",
	 *   "Longitude": "139.75495999999998",
	 *   "Latitude": "35.649792999999995",
	 *   "GpsFixStatus": "not fix",
	 *   "ReportType": "Periodic mode report",
	 *   "BatteryCapacity": "65",
	 *   "Date&Time": "2014-10-10T13:50:40+09:00" // ISO8601���� 
	 * }
	 * 
	 */
	JsonNode payloadJson;
	/**
	 */
	String deviceIdentifiyer;

	public DecodedPayload(Date time, Date payloadTime, String payloadString, JsonNode payloadJson,
			String deviceIdentifiyer) {
		this.time = time;
		this.payloadTime = payloadTime;
		this.payloadString = payloadString;
		this.payloadJson = payloadJson;
		this.deviceIdentifiyer = deviceIdentifiyer;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getPayloadString() {
		return payloadString;
	}

	public void setPayloadString(String payloadString) {
		this.payloadString = payloadString;
	}

	public JsonNode getPayloadJson() {
		return payloadJson;
	}

	public void setPayloadJson(JsonNode palyload_json) {
		this.payloadJson = palyload_json;
	}

	public String getDeviceIdentifiyer() {
		return deviceIdentifiyer;
	}

	public void setDeviceIdentifiyer(String deviceIdentifiyer) {
		this.deviceIdentifiyer = deviceIdentifiyer;
	}

	public Date getPayloadTime() {
		return payloadTime;
	}

	public void setPayloadTime(Date payloadTime) {
		this.payloadTime = payloadTime;
	}
}
