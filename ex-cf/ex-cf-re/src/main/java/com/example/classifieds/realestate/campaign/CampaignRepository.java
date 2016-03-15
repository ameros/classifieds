package com.example.classifieds.realestate.campaign;

public interface CampaignRepository {

	Campaign get(Long id);

	void put(Campaign campaign);

}
