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
 * Created on June 7, 2010
 * Author: Mark Chapman
 */

package org.biojava3.alignment.template;

public interface GapPenalty {

    enum Type {CONSTANT, LINEAR, AFFINE, DYNAMIC}; // gep = 0, gep = gop, gep != gop, changing

    short getExtensionPenalty();

    short getOpenPenalty();

    Type getType();

    void setExtensionPenalty(short gep);

    void setOpenPenalty(short gop);

}
