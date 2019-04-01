package com.cisco.japan.as.uran.payloaddecoder;

import java.util.Date;

public class EncodedPayload {
	/**
	 * payload�f�[�^���A�b�v���[�h���ꂽ����
	 */
	Date time;
	/**
	 * �f�R�[�h�Ώۂ�payload�̃f�[�^������
	 */
	String payloadString;
	/**
	 * payloadString���^�������f�o�C�X�̎��ʎq
	 */
	String deviceIdentifiyer;

	public EncodedPayload(Date time, String payloadString, String deviceIdentifiyer) {
		this.time = time;
		this.payloadString = payloadString;
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

	public String getDeviceIdentifiyer() {
		return deviceIdentifiyer;
	}

	public void setDeviceIdentifiyer(String deviceIdentifiyer) {
		this.deviceIdentifiyer = deviceIdentifiyer;
	}
}
