package com.example.classifieds.realestate.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.classifieds.realestate.advertisement.AdvertisementRepository;
import com.example.classifieds.realestate.campaign.CampaignRepository;
import com.example.classifieds.realestate.commands.AssignAdCommand;
import com.example.classifieds.realestate.commands.AssignAdCommandHandler;
import com.example.classifieds.realestate.exposure.ExposureRepository;

@Transactional
@Service
public class AssignAdCommandHandlerImpl implements AssignAdCommandHandler {

//	private final CampaignRepository campaignRepo;
	private final AdvertisementRepository adRepo;
//	private final ExposureRepository expRepo;

	@Autowired
	public AssignAdCommandHandlerImpl(
			//CampaignRepository campaignRepo,
			AdvertisementRepository adRepo//, ExposureRepository expRepo
			) {
//		this.campaignRepo = campaignRepo;
		this.adRepo = adRepo;
//		this.expRepo = expRepo;
	}

	public void handle(AssignAdCommand command) {
		// TODO Auto-generated method stub

	}

}
