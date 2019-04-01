package com.cisco.japan.as.uran.payloaddecoder;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

public class DecodedPayload {
	/**
	 * EncodedPayload�œn���ꂽ����
	 */
	Date time;
	/**
	 * payload���̃f�[�^���̂��\������̎��ԁi�ʏ�̓f�[�^�̍̎掞���j�B�����ꍇ��null
	 */
	Date payloadTime;
	/**
	 * �f�R�[�h�O��payload(�ʏ�͑Ή�����EncodedPayload�̒l���Z�b�g�j
	 */
	String payloadString;
	/**
	 * payload�f�R�[�h���JSON�i�f�o�C�X��ނɂ���ėl�X�����A�Ⴆ�Ή��L�̂悤��JsonNode�ƂȂ�j 
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
	JsonNode palyloadJson;
	/**
	 * �f�o�C�X�̎��ʎq�i�ʏ��EncodedPayload�œn���ꂽ�l�����A�f�R�[�h�ɂ����EncodedPayload����ύX�̉\��������j
	 */
	String deviceIdentifiyer;

	public DecodedPayload(Date time, Date payloadTime, String payloadString, JsonNode palyloadJson,
			String deviceIdentifiyer) {
		this.time = time;
		this.payloadTime = payloadTime;
		this.payloadString = payloadString;
		this.palyloadJson = palyloadJson;
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

	public JsonNode getPalyloadJson() {
		return palyloadJson;
	}

	public void setPalyloadJson(JsonNode palyload_json) {
		this.palyloadJson = palyload_json;
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
