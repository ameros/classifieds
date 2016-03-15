package com.example.classifieds.realestate.advertisement;

public interface AdvertisementRepository {

	Advertisement get(Long id);

	void put(Advertisement advertisement);

}
