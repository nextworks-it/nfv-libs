/*
* Copyright 2018 Nextworks s.r.l.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package it.nextworks.nfvmano.libs.ifa.vrmanagement.interfaces.messages.nfp;

import java.util.ArrayList;
import java.util.List;

import it.nextworks.nfvmano.libs.ifa.common.InterfaceMessage;
import it.nextworks.nfvmano.libs.ifa.common.exceptions.MalformattedElementException;

/**
 * Response to a create NFP request
 * 
 * REF IFA 005 v2.3.1 - 7.4.5.2
 * 
 * @author nextworks
 *
 */
public class CreateNfpResponse implements InterfaceMessage {

	private List<String> nfpId = new ArrayList<>();
	
	public CreateNfpResponse() { }
	
	/**
	 * Constructor
	 * 
	 * @param nfpId The unique identification of the NFP(s) that has been created. This identification can be used to identify a particular NFP as and when required.
	 */
	public CreateNfpResponse(List<String> nfpId) {
		if (nfpId != null) this.nfpId = nfpId;
	}
	
	

	/**
	 * @return the nfpId
	 */
	public List<String> getNfpId() {
		return nfpId;
	}

	@Override
	public void isValid() throws MalformattedElementException {
		if ((nfpId == null) || (nfpId.isEmpty())) throw new MalformattedElementException("Create NFP response without NFP ID.");
	}

}
