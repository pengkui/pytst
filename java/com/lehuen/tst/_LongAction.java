/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.lehuen.tst;

public class _LongAction {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected _LongAction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_LongAction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected _LongAction() {
    this(0, false);
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      tstJNI.delete__LongAction(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void perform(String string, int remaining_distance, long data) {
    tstJNI._LongAction_perform(swigCPtr, string, remaining_distance, data);
  }

  public long result() {
    return tstJNI._LongAction_result(swigCPtr);
  }

}
