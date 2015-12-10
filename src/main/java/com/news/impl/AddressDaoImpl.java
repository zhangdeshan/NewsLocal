package com.news.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.news.dao.AddressDao;
import com.news.model.Address;
import com.news.tools.DaoSupportImpl;

@Transactional
@Repository("addressDao")
public class AddressDaoImpl extends DaoSupportImpl<Address> implements
		AddressDao {

}
