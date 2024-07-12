package com.template.config;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自动填充添加时间和修改时间
 *
 * @author Doug Liu
 * @since 2022-06-10
 */
@Component
public class MybatisPlusMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        Date today = new Date();
        setFieldValByName("createTime", today, metaObject);
        setFieldValByName("updateTime", today, metaObject);
    }


    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject) {
        this.strictInsertFill(metaObject, fieldName, fieldVal, fieldVal.getClass());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject, String... props) {
        this.strictInsertFill(metaObject, fieldName, fieldVal, fieldVal.getClass());
    }

    @Override
    public void updateFill(MetaObject metaObject, String... props) {
        setFieldValByName("updateTime", new Date(), metaObject);
        setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject, String[] props, String... ignoreProperties) {
        
        this.strictInsertFill(metaObject, fieldName, fieldVal, fieldVal.getClass());

    }

    @Override
    public void updateFill(MetaObject metaObject, String[] props, String... ignoreProperties) {
        setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject, String[] props, String... ignoreProperties) {
        setFieldValByName("updateTime", new Date(), metaObject);         
    @Override
    public void setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject, String[] props, String... ignoreProperties) {
        
        this.strictInsertFill(metaObject, fieldName, fieldVal, fieldVal.getClass());
    }
        
    }



}
