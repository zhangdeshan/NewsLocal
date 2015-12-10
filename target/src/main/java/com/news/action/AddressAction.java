package com.news.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.model.Address;
import com.news.tools.BaseAction;
import com.news.tools.PageModel;
import com.opensymphony.xwork2.ModelDriven;

@Scope("prototype")
@Controller("addressAction")
public class AddressAction extends BaseAction implements ModelDriven<Address> {

	/**
	 * @author zhangdeshan
	 * 
	 * 地址的增删改查
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String addressAdd() {
		if (Address_Pids != null && Address_Pids > 0) {
			Address parent = addressDao.load(Address_Pids);
			address.setAddress_Level(parent.getAddress_Level() + 1);
		}
		return "AddSuccess";
	}

	public String addressSave() {
		if (Address_Pids != null && Address_Pids > 0) {

			address.setParent(addressDao.load(Address_Pids));
		}
		addressDao.saveOrUpdate(address);

		return addressList();
	}

	public String addressList() {
		Object[] params = null;
		String where;
		if (Address_Pids != null && Address_Pids > 0) {
			where = "where parent.Address_Id =?";
			params = new Integer[] { Address_Pids };
		} else {
			where = "where parent is null";
		}

		pageModel = addressDao.find(pageNo, pageSize, where, params);

		return "addressList";
	}

	public String addressEdit() {

		if (address.getAddress_Id() != null) {

			this.address = addressDao.get(address.getAddress_Id());

		}

		return "addressEdit";
	}

	public String addressDelect() {
		if (address.getAddress_Id() != null) {

			addressDao.delete(address.getAddress_Id());
		}

		return "addressDelect";
	}

	private PageModel<Address> pageModel;

	private Address address = new Address();

	private Integer Address_Pids;

	public PageModel<Address> getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel<Address> pageModel) {
		this.pageModel = pageModel;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getAddress_Pids() {
		return Address_Pids;
	}

	public void setAddress_Pids(Integer address_Pids) {
		Address_Pids = address_Pids;
	}

	@Override
	public Address getModel() {
		return address;
	}

}
