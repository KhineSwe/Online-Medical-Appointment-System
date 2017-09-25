package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.Rating;

public interface RatingDao {

	public List<Rating> getDrateValue(int did);
	public Rating getRateValue(int pid, int did);

	public void saveRate(Rating myRate);


}
