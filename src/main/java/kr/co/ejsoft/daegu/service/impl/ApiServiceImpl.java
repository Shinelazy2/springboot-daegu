package kr.co.ejsoft.daegu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import kr.co.ejsoft.daegu.model.CarInfo;
import kr.co.ejsoft.daegu.model.CarfreeRquest;
import kr.co.ejsoft.daegu.repository.ApiRepository;
import kr.co.ejsoft.daegu.service.ApiService;

@Service
@Transactional
public class ApiServiceImpl implements ApiService {

  @Autowired
  private ApiRepository apiRepository;

  @Override
  public void toJson(CarInfo info) {
    Gson gson = new Gson();
    int carNoCnt = Integer.parseInt(info.getCarNoCnt());

    for (int i = 0; i < carNoCnt; i++) {
      CarfreeRquest carfree = new CarfreeRquest();
      System.out.println(i);
      String CarNoListInObject = info.getCarNoList().get(i).toString();
      System.out.println(CarNoListInObject);
      CarInfo carNo = gson.fromJson(CarNoListInObject, CarInfo.class);
      carfree.setCarNo(carNo.getCarNO());
      carfree.setCarNoCnt(info.getCarNoCnt());
      carfree.setLinkedSn(info.getLinkedSn());
      carfree.setLinkedTm(info.getLinkedTm());
      carfree.setReqDay(info.getReqDay());
      carfree.setReqTm(info.getLinkedTm());
      apiRepository.save(carfree);
    }
    // apiRepository.selectData();
    // TypedQuery<CarfreeRquest> query = entityManager.createQuery("SELECT lr FROM
    // CarfreeRquest lr WHERE SEQ = 1",
    // TypedQuery<CarfreeRquest> query = entityManager.createQuery("SELECT lr FROM
    // LEZ_RTVI lr WHERE SEQ = 1",
    // CarfreeRquest.class);
    // List<CarfreeRquest> carFree = query.getResultList();
    // System.out.println(carFree);
    // this.selectData();
    List<List<String>> test = apiRepository.selectData();
    System.out.println(test);

  }

}
