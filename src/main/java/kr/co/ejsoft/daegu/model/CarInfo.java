package kr.co.ejsoft.daegu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CarInfo {

  @JsonProperty("LINKED_SN")
  private String linkedSn;

  @JsonProperty("LINKED_TM")
  private String linkedTm;

  @JsonProperty("REQ_TM")
  private String reqTm;

  @JsonProperty("REQ_DAY")
  private String reqDay;

  @JsonProperty("CAR_NO_CNT")
  private String carNoCnt;

  @JsonProperty("CAR_NO_LIST")
  private List<Object> carNoList;

  private String carNO;
  // private List[] carNoList;

  // @JsonProperty("CAR_NO")
  // private String carNo;

  // public CarfreeRquest toEntity() {
  // return
  // CarfreeRquest.builder().linkedSn(linkedSn).linkedTm(linkedTm).reqTm(reqTm).reqDay(reqDay).carNo(carNo)
  // .build();
  // }
}
