package com.example.classifieds.realestate.exposure;

import com.example.classifieds.realestate.advertisement.Advertisement;
import com.example.classifieds.realestate.campaign.Campaign;

public final class Exposure {

	private final Campaign campaign;
	private final Advertisement advertisement;

	public Exposure(Campaign campaign, Advertisement advertisement) {
		this.campaign = campaign;
		this.advertisement = advertisement;
	}

	public ExposureId getExposureId() {
		return new ExposureId(campaign.getId(), advertisement.getId());
	}

}
