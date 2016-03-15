package com.example.classifieds.realestate.commands;

public class AssignAdCommandImpl implements AssignAdCommand {

	private final Long campaignId;
	private final Long advertisementId;

	public AssignAdCommandImpl(Long campaignId, Long advertisementId) {
		this.campaignId = campaignId;
		this.advertisementId = advertisementId;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public Long getAdvertisementId() {
		return advertisementId;
	}

}
