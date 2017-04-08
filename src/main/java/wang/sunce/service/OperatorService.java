package wang.sunce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.sunce.dao.OperatorDao;
import wang.sunce.entity.Operator;

import java.util.List;

@Service
@Transactional
public class OperatorService {
    @Autowired
    OperatorDao OperatorDao;

    public void save(Operator Operator){
        OperatorDao.save(Operator);
    }

    public Operator update(Operator Operator){
        OperatorDao.save(Operator);
        return Operator;
    }

    public List<Operator> findAll(){
        return OperatorDao.findAll();
    }

    public void delete(Operator Operator){
        OperatorDao.delete(Operator);
    }
}
