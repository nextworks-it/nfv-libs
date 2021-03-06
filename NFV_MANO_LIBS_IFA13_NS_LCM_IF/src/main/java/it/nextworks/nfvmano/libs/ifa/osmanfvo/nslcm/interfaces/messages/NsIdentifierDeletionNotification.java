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
package it.nextworks.nfvmano.libs.ifa.osmanfvo.nslcm.interfaces.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import it.nextworks.nfvmano.libs.ifa.common.InterfaceMessage;
import it.nextworks.nfvmano.libs.ifa.common.exceptions.MalformattedElementException;

/**
 * This notification informs the receiver of the deletion of an NS instance identifier 
 * and of the associated instance of an NsInfo information element identified by that identifier.
 * 
 * REF IFA 013 v2.3.1 - 8.3.2.10
 * 
 * @author nextworks
 *
 */
public class NsIdentifierDeletionNotification implements InterfaceMessage {

	private String nsInstanceId;
	
	public NsIdentifierDeletionNotification() {	}
	
	/**
	 * Constructor
	 * 
	 * @param nsInstanceId The NS instance identifier that has been deleted.
	 */
	public NsIdentifierDeletionNotification(String nsInstanceId) {
		this.nsInstanceId = nsInstanceId;
	}
	
	/**
	 * @return the nsInstanceId
	 */
	@JsonProperty("nsInstanceId")
	public String getNsInstanceId() {
		return nsInstanceId;
	}

	@Override
	public void isValid() throws MalformattedElementException {
		if (nsInstanceId == null) throw new MalformattedElementException("NS ID deletion notify without NS ID");
	}

}
