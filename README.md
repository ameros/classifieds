# Yet Another Architecture Clean Up
slices, clean architecture, runtime dependencies example

## Slices first

_Classified Ads_ is sample domain. First context is _Realestate_. So:

- com.example.classifieds.realestate.campaign
- com.example.classifieds.realestate.advertisement
- com.example.classifieds.realestate.exposure

## Then layers

Commands:
- com.example.classifieds.realestate.commands

Handlers:
- com.example.classifieds.realestate.handlers 

Repositories:
- com.example.classifieds.realestate.repositories

## Abstraction first


## Then dependencies
