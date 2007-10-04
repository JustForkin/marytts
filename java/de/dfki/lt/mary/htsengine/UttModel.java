/**   
*           The HMM-Based Speech Synthesis System (HTS)             
*                       HTS Working Group                           
*                                                                   
*                  Department of Computer Science                   
*                  Nagoya Institute of Technology                   
*                               and                                 
*   Interdisciplinary Graduate School of Science and Engineering    
*                  Tokyo Institute of Technology                    
*                                                                   
*                Portions Copyright (c) 2001-2006                       
*                       All Rights Reserved.
*                         
*              Portions Copyright 2000-2007 DFKI GmbH.
*                      All Rights Reserved.                  
*                                                                   
*  Permission is hereby granted, free of charge, to use and         
*  distribute this software and its documentation without           
*  restriction, including without limitation the rights to use,     
*  copy, modify, merge, publish, distribute, sublicense, and/or     
*  sell copies of this work, and to permit persons to whom this     
*  work is furnished to do so, subject to the following conditions: 
*                                                                   
*    1. The source code must retain the above copyright notice,     
*       this list of conditions and the following disclaimer.       
*                                                                   
*    2. Any modifications to the source code must be clearly        
*       marked as such.                                             
*                                                                   
*    3. Redistributions in binary form must reproduce the above     
*       copyright notice, this list of conditions and the           
*       following disclaimer in the documentation and/or other      
*       materials provided with the distribution.  Otherwise, one   
*       must contact the HTS working group.                         
*                                                                   
*  NAGOYA INSTITUTE OF TECHNOLOGY, TOKYO INSTITUTE OF TECHNOLOGY,   
*  HTS WORKING GROUP, AND THE CONTRIBUTORS TO THIS WORK DISCLAIM    
*  ALL WARRANTIES WITH REGARD TO THIS SOFTWARE, INCLUDING ALL       
*  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS, IN NO EVENT   
*  SHALL NAGOYA INSTITUTE OF TECHNOLOGY, TOKYO INSTITUTE OF         
*  TECHNOLOGY, HTS WORKING GROUP, NOR THE CONTRIBUTORS BE LIABLE    
*  FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY        
*  DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,  
*  WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTUOUS   
*  ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR          
*  PERFORMANCE OF THIS SOFTWARE.                                    
*                                                                   
*/

package de.dfki.lt.mary.htsengine;


import java.util.Vector;

/**
 * list of Model objects for current utterance.
 * 
 * Java port and extension of HTS engine version 2.0
 * Extension: mixed excitation
 * @author Marcela Charfuelan
 */
public class UttModel {

  private int nModel;        /* # of models for current utterance       */
  private int nState;        /* # of HMM states for current utterance   */ 
  private int totalframe;    /* # of frames for current utterance       */
  private int lf0frame;      /* # of frames that are voiced or non-zero */
  private Vector ModelList;  /* This will be a list of Model objects for current utterance */

  
  public UttModel() {
	nModel = 0;
	nState = 0;
	totalframe = 0;
	lf0frame = 0;
	ModelList = new Vector();
  }
  
  public void set_nModel(int val){ nModel = val; }
  public int get_nModel(){ return nModel; }
  
  public void set_nState(int val){ nState = val; }
  public int get_nState(){ return nState; }
  
  public void set_totalframe(int val){ totalframe = val; }
  public int get_totalframe(){ return totalframe; }
  
  public void set_lf0frame(int val){ lf0frame = val; }
  public int get_lf0frame(){ return lf0frame; }
  
  public void addUttModel(Model new_model){ ModelList.addElement(new_model); }
  public Model getUttModel(int i){ return (Model) ModelList.elementAt(i); 	}
  public int getNumUttModel(){ return ModelList.size(); }
  
}
