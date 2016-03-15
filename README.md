# Yet Another Architecture Clean Up
slices, clean architecture, runtime dependencies (inversion & || externalization) example

## Slices first

_Classified Ads_ is sample domain. First context is _Realestate_. So:

- com.example.classifieds.realestate.campaign
- com.example.classifieds.realestate.advertisement
- com.example.classifieds.realestate.exposure

## Then layers

_Domain_:
- com.example.classifieds.realestate

_Persistence_:
- com.example.classifieds.realestate.repositories

_Use Cases_:
- com.example.classifieds.realestate.commands

_Interactors_:
- com.example.classifieds.realestate.handlers 

## Abstraction first
- Repositories in the domain are **interfaces**
- Handlers in use cases are **interfaces**

## Then dependencies
- _Persistence_ implements domain repositories
- _Interactors_ are implementation of use cases' handlers; depend on domain but not on persistence

## Experiment
- Each detail (implementation) _can_ be considered as **runtime** dependency for higher level
- Infrastructure _can_ be considered as _orbit_ with _satellites_
- Layers are glued with help of _satellites_
