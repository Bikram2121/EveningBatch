/**  
 * 
 */
package com.sellabs.oops;

/**
 * @author Sipun
 *
 */
public class ImplSampleInterfc extends Parent implements SampleInterfc,SampleInterfcTwo {

	@Override
	public void opsThree() {
		// TODO Auto-generated method stub
		System.out.println("opsthree");
	}

	@Override
	public void opsOne() {
		// TODO Auto-generated method stub
		System.out.println("opsone");
	}

	@Override
	public void opsTwo() {
		// TODO Auto-generated method stub
		System.out.println("opstwo");
	}
	
		@Override
		public void opsFour() {
			// TODO Auto-generated method stub
			super.opsFour();
		}
	
	
}
