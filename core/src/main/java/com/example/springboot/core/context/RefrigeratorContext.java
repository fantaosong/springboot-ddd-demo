package com.example.springboot.core.context;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RefrigeratorContext implements IDomainContext,IRefrigeratorContext {

  private String data;

  private RefrigeratorData refrigeratorData;

  private long time;


  public RefrigeratorContext(String data) {
    this.data = data;
  }

  @Override
  public void setRefrigerator(RefrigeratorData refrigeratorData) {
    this.refrigeratorData = refrigeratorData;
  }

  @Override
  public RefrigeratorData getRefrigerator() {
    return refrigeratorData;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }
}
