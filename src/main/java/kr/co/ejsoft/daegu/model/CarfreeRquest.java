package kr.co.ejsoft.daegu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "CARFREE_RQUEST")
// @IdClass(CarfreeRquest.class)
// @Embeddable
public class CarfreeRquest implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SEQ")
  private int seq;

  @Column(name = "LINKED_SN")
  private String linkedSn;

  @Column(name = "CAR_NO")
  private String carNo;

  @Column(name = "LINKED_SM")
  private String linkedTm;

  @Column(name = "REQ_TM")
  private String reqTm;

  @Column(name = "REQ_DAY")
  private String reqDay;

  @Column(name = "CAR_NO_CNT")
  private String carNoCnt;

  // public CarfreeRquest toEntity(CarInfo info) {
  // CarfreeRquest carfreeRquest = CarfreeRquest.builder()
  // .carNo(info.getCAR_NO())
  // .carNoCnt(info.getCarNoCnt())
  // .linkedSn(info.getLinkedSn())
  // .linkedTm(info.getLinkedTm())
  // .reqDay(info.getReqDay())
  // .reqTm(info.getReqTm())
  // .build();
  // return carfreeRquest;
  // }

}
