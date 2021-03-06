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
package it.nextworks.nfvmano.libs.ifa.vrmanagement.interfaces.messages.vresources;

import java.util.ArrayList;
import java.util.List;

import it.nextworks.nfvmano.libs.ifa.common.InterfaceMessage;
import it.nextworks.nfvmano.libs.ifa.common.exceptions.MalformattedElementException;
import it.nextworks.nfvmano.libs.ifa.vrmanagement.interfaces.elements.NfviPop;

public class NfviPopInformationResponse implements InterfaceMessage {

	private List<NfviPop> nfviInfo = new ArrayList<>();
	
	public NfviPopInformationResponse() { }
	
	/**
	 * Constructor
	 * 
	 * @param nfviInfo The filtered information that has been retrieved
	 */
	public NfviPopInformationResponse(List<NfviPop> nfviInfo) {
		if (nfviInfo != null) this.nfviInfo = nfviInfo;
	}

	
	
	/**
	 * @return the nfviInfo
	 */
	public List<NfviPop> getNfviInfo() {
		return nfviInfo;
	}

	@Override
	public void isValid() throws MalformattedElementException {
		for (NfviPop nfvi : nfviInfo) nfvi.isValid();
	}

}
