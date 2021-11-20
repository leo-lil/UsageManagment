package com.ai.openbilling.cdr.domain;

/**
 * Possible values for the status of the Usage
 **/
/**
 * Possible values for the status of the Usage
 */
public enum UsageStatusType {
  
  RECEIVED("received"),
  
  REJECTED("rejected"),
  
  RECYCLED("recycled"),
  
  GUIDED("guided"),
  
  RATED("rated"),
  
  RERATED("rerated"),
  
  BILLED("billed");

  private String value;

  UsageStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


