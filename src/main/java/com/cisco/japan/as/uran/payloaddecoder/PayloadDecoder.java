package com.cisco.japan.as.uran.payloaddecoder;

import java.util.List;


/**
 * 
 * @author ykurozum
 *
 */
public interface PayloadDecoder {

	public List<DecodedPayload> decode(List<EncodedPayload> encodedPayloadList) throws Exception;

}
