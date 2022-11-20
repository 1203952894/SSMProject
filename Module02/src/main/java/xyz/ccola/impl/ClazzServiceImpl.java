package xyz.ccola.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xyz.ccola.dao.ClazzDao;
import xyz.ccola.service.ClazzService;

/**
 * @ Name: ClazzServiceImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 23:35
 * @ Description: ClazzServiceImpl
 */
@Service(value = "clazzService01")
@Data
@NoArgsConstructor
public class ClazzServiceImpl implements ClazzService {

    @Qualifier(value = "clazzDao01")
    private ClazzDao clazzDao;

    @Autowired
    public ClazzServiceImpl(ClazzDao clazzDao) {
        this.clazzDao = clazzDao;
    }

    @Override
    public void saveClazz() {
        clazzDao.saveClazz();
    }
}
