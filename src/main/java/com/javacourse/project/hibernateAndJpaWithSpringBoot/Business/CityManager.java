package com.javacourse.project.hibernateAndJpaWithSpringBoot.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpaWithSpringBoot.DataAccess.ICityDal;
import com.javacourse.project.hibernateAndJpaWithSpringBoot.Entities.City;

@Service
public class CityManager implements ICityService {

	private ICityDal cityDal;

	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Transactional
	public List<City> getAll() {

		return this.cityDal.getAll();
	}

	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
	}

	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
	}

	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
	}

	@Transactional
	public City getById(int id) {
		return cityDal.getById(id);
	}

}