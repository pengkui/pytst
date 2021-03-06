/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.lehuen.tst;

public class TSTException {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TSTException(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TSTException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected TSTException() {
    this(0, false);
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      tstJNI.delete_TSTException(swigCPtr);
    }
    swigCPtr = 0;
  }

  public TSTException(String _message) {
    this(tstJNI.new_TSTException(_message), true);
  }

  public void setMessage(String message) {
    tstJNI.set_TSTException_message(swigCPtr, message);
  }

  public String getMessage() {
    return tstJNI.get_TSTException_message(swigCPtr);
  }

}
