package kr.co.ejsoft.daegu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kr.co.ejsoft.daegu.model.CarfreeRquest;

@Repository
public interface ApiRepository extends JpaRepository<CarfreeRquest, Integer> {
  // @Query(value = "SELECT * " +
  // " FROM LEZ_RTVI" +
  // " LEFT JOIN " +
  // " CARFREE_RQUEST ON LEZ_RTVI.CAR_REG_NO= " +
  // " CAR_NO WHERE CAR_REG_NO='07저1859'", nativeQuery = true)
  // @Query(value = "SELECT lr.CAR_REG_NO FROM LEZ_RTVI lr WHERE SEQ = '12'",
  // nativeQuery = true)
  // @Query(value = "SELECT lr.REG_DT FROM LEZ_RTVI lr WHERE CAR_REG_NO =
  // '70거1337'", nativeQuery = true)
  // @Query(value = "SELECT lr.REG_DT FROM LEZ_RTVI lr WHERE CAR_REG_NO =
  // '70거1337'", nativeQuery = true)
  @Query(value = "SELECT  " +
      "  LEFT(LR.SHOT_DT,8) AS DETECT_DATE " +
      ", RIGHT(LR.SHOT_DT,6) " +
      ", SITE_NAME AS DETECT_LOCATION_NM " +
      ", LR.CAR_REG_NO " +
      ", LS.SITE_LAT " +
      ", LS.SITE_LNG " +
      "FROM LEZ_RTVI LR " +
      "LEFT JOIN CARFREE_RQUEST CR ON CAR_REG_NO = CAR_NO " +
      "LEFT JOIN LEZ_SITE LS ON SITE_ID = LEFT(REPLACE(LANE_ID, 'L','S'),9) " +
      "WHERE CAR_REG_NO = '50우6466' ", nativeQuery = true)
  public List<List<String>> selectData();

}
