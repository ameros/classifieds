package com.example.classifieds.realestate.exposure;

import java.util.Objects;

public final class ExposureId {

	private Long campaignId;
	private Long advertisementId;

	public ExposureId(Long campaignId, Long advertisementId) {
		this.campaignId = campaignId;
		this.advertisementId = advertisementId;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public Long getAdvertisementId() {
		return advertisementId;
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(this, obj);
	}

	@Override
	public int hashCode() {
		return Objects.hash(campaignId, advertisementId);
	}

}
