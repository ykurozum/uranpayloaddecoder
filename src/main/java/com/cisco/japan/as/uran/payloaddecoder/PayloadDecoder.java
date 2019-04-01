package com.cisco.japan.as.uran.payloaddecoder;

import java.util.List;


/**
 * 
 * @author ykurozum
 *
 */
public interface PayloadDecoder {

	public List<DecodedPayload> encode(List<EncodedPayload> encodedPayloadList) throws Exception;

}
