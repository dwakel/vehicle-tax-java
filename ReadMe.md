### Vehicle Tax

Provides basic tax/duty information about types and categories of vehicles you can import into the country. Also calculates a vehicles import duty/tax. This is based on real information provided by the GRA Customs Ghana

ACT 891 CUSTOMS ACT, 2015



#### How to Use Search And Sort on /api/Vehicle/TaxInformation/SearchSort

Type in your Search or sort parameter into the searchBy{} or sortBy{}
eg. searchBy {"typeName": "ambulance"}
sortBy {"importDuty": "asc"}  (either "asc",ascending or "desc", descending)

### List of Searchable Parametes
- categoryDescription
- typeName
- typeDescription
- categoryName
- importduty"
- vat
- nhil,
- getfundlevy,
- aulevy
- ecowaslevy
- eximlevy
- examlevy
- processingfee
- specialimportlevy

### List of Sortable Parametes
- importduty"
- vat
- nhil,
- getfundlevy,
- aulevy
- ecowaslevy
- eximlevy
- examlevy
- processingfee
- specialimportlevy



-Migrations (database scripts) can be found in the migration directory within project directory
- Migration are written in raw sql

