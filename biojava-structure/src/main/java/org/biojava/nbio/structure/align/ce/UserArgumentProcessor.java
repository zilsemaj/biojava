/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 */
package org.biojava.nbio.structure.align.ce;

import org.biojava.nbio.structure.align.util.ConfigurationException;

public interface UserArgumentProcessor {

	
	/** Process user arguments that have been provided from the command line
	 * 
	 * @param argv
	 */
	public void process(String[] argv) throws ConfigurationException;
	
	/**
	 * Print help about the arguments
	 * @return
	 */
	public String printHelp();
}
