# Yet Another Architecture Clean Up
slices, clean architecture, runtime dependencies example

## Slices first

_Classified Ads_ is sample domain. First context is _Realestate_. So:

- com.example.classifieds.realestate.campaign
- com.example.classifieds.realestate.advertisement
- com.example.classifieds.realestate.exposure

## Then layers

Use Cases:
- com.example.classifieds.realestate.commands

Interactors:
- com.example.classifieds.realestate.handlers 

Persistence:
- com.example.classifieds.realestate.repositories

## Abstraction first
- Repositories in the domain are interfaces
- Handlers in use cases are interfaces

## Then dependencies
- Persistence implements domain repositories
- Interactors are implementation of use cases; depend on domain but not on persistence
- Each detail (implementation) can be considered runtime dependency
