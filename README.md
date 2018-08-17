# Bakery 

function for msgs

## Getting Started

add jitpack.io in allprojects, in project gradle

    allprojects {
        repositories {
            google()
            jcenter()
            maven { url 'https://jitpack.io' }
        }
    }

### Prerequisites

  suport in module gradle

    implementation "com.android.support:appcompat-v7:${yourversion}"
    implementation "com.android.support:support-v4:${yourversion}"
    implementation "com.android.support:design:${yourversion}"
  

### Installing

 implement lib in yout module gradle
 
    implementation 'com.github.quanticheart:bakery:1.0.9'

 for module gradle incompatible, use:

    implementation ('com.github.quanticheart:bakery:1.0.9'){
           exclude group: "com.android.support"
    }

## Deployment

 development of free code

## Built With

* [Android Studio 3.1.2](https://developer.android.com/studio/) 

## Contributing

* [https://www.impacta.com.br/] - teacher hugo

## Authors

* **J. A. Santos** - *Initial work* - development of free code

See also the list of [contributor](https://github.com/master-killercode).

## License
 development of free code

## Acknowledgments

* teacher hugo, for sharing their knowledgec

