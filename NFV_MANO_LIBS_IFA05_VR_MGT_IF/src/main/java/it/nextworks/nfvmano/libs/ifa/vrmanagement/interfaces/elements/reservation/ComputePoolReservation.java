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
package it.nextworks.nfvmano.libs.ifa.vrmanagement.interfaces.elements.reservation;

import it.nextworks.nfvmano.libs.ifa.common.InterfaceInformationElement;
import it.nextworks.nfvmano.libs.ifa.common.exceptions.MalformattedElementException;

/**
 * The compute reservation information elements encapsulate information 
 * about virtual compute resource pool reservations. 
 * The information elements contain details about number of CPU cores, 
 * number of virtualisation container instances, size of virtual memory, 
 * as well as different attributes of the virtual compute resource pool.
 * 
 * REF IFA 005 v2.3.1 - 8.8.3.2
 * 
 * @author nextworks
 *
 */
public class ComputePoolReservation implements InterfaceInformationElement {

	private int numCpuCores;
	private int numVcInstances;
	private int virtualMemSize;
	private VirtualComputeAttributesReservationData computeAttributes;
	
	public ComputePoolReservation() {	}
	
	/**
	 * Constructor
	 * 
	 * @param numCpuCores Number of CPU cores to be reserved.
	 * @param numVcInstances Number of virtualised container instances to be reserved.
	 * @param virtualMemSize Size of virtual memory to be reserved.
	 * @param computeAttributes Information specifying additional attributes of the compute resource to be reserved.
	 */
	public ComputePoolReservation(int numCpuCores,
			int numVcInstances,
			int virtualMemSize,
			VirtualComputeAttributesReservationData computeAttributes) {	
		this.numCpuCores = numCpuCores;
		this.numVcInstances = numVcInstances;
		this.virtualMemSize = virtualMemSize;
		this.computeAttributes = computeAttributes;
	}

	
	
	/**
	 * @return the numCpuCores
	 */
	public int getNumCpuCores() {
		return numCpuCores;
	}

	/**
	 * @return the numVcInstances
	 */
	public int getNumVcInstances() {
		return numVcInstances;
	}

	/**
	 * @return the virtualMemSize
	 */
	public int getVirtualMemSize() {
		return virtualMemSize;
	}

	/**
	 * @return the computeAttributes
	 */
	public VirtualComputeAttributesReservationData getComputeAttributes() {
		return computeAttributes;
	}

	@Override
	public void isValid() throws MalformattedElementException {
		if (computeAttributes != null) computeAttributes.isValid();
	}

}
