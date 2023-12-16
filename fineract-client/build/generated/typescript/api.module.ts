import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { apacheFineractClientConfiguration } from './configuration';
import { HttpClient } from '@angular/common/http';

import { AccountNumberFormatService } from './apache-fineract-client/services/accountNumberFormat.service';
import { AccountTransfersService } from './apache-fineract-client/services/accountTransfers.service';
import { AccountingClosureService } from './apache-fineract-client/services/accountingClosure.service';
import { AccountingRulesService } from './apache-fineract-client/services/accountingRules.service';
import { AdhocQueryApiService } from './apache-fineract-client/services/adhocQueryApi.service';
import { AuditsService } from './apache-fineract-client/services/audits.service';
import { AuthenticationHTTPBasicService } from './apache-fineract-client/services/authenticationHTTPBasic.service';
import { BatchAPIService } from './apache-fineract-client/services/batchAPI.service';
import { BulkImportService } from './apache-fineract-client/services/bulkImport.service';
import { BulkLoansService } from './apache-fineract-client/services/bulkLoans.service';
import { BusinessDateManagementService } from './apache-fineract-client/services/businessDateManagement.service';
import { CacheService } from './apache-fineract-client/services/cache.service';
import { CalendarService } from './apache-fineract-client/services/calendar.service';
import { CashierJournalsService } from './apache-fineract-client/services/cashierJournals.service';
import { CashiersService } from './apache-fineract-client/services/cashiers.service';
import { CentersService } from './apache-fineract-client/services/centers.service';
import { ChargesService } from './apache-fineract-client/services/charges.service';
import { ClientService } from './apache-fineract-client/services/client.service';
import { ClientChargesService } from './apache-fineract-client/services/clientCharges.service';
import { ClientCollateralManagementService } from './apache-fineract-client/services/clientCollateralManagement.service';
import { ClientFamilyMemberService } from './apache-fineract-client/services/clientFamilyMember.service';
import { ClientIdentifierService } from './apache-fineract-client/services/clientIdentifier.service';
import { ClientTransactionService } from './apache-fineract-client/services/clientTransaction.service';
import { ClientsAddressService } from './apache-fineract-client/services/clientsAddress.service';
import { CodeValuesService } from './apache-fineract-client/services/codeValues.service';
import { CodesService } from './apache-fineract-client/services/codes.service';
import { CollateralManagementService } from './apache-fineract-client/services/collateralManagement.service';
import { CollectionSheetService } from './apache-fineract-client/services/collectionSheet.service';
import { CreditBureauConfigurationService } from './apache-fineract-client/services/creditBureauConfiguration.service';
import { CurrencyService } from './apache-fineract-client/services/currency.service';
import { DataTablesService } from './apache-fineract-client/services/dataTables.service';
import { DefaultService } from './apache-fineract-client/services/default.service';
import { DepositAccountOnHoldFundTransactionsService } from './apache-fineract-client/services/depositAccountOnHoldFundTransactions.service';
import { DeviceRegistrationService } from './apache-fineract-client/services/deviceRegistration.service';
import { DocumentsService } from './apache-fineract-client/services/documents.service';
import { EntityDataTableService } from './apache-fineract-client/services/entityDataTable.service';
import { EntityFieldConfigurationService } from './apache-fineract-client/services/entityFieldConfiguration.service';
import { ExternalServicesService } from './apache-fineract-client/services/externalServices.service';
import { FetchAuthenticatedUserDetailsService } from './apache-fineract-client/services/fetchAuthenticatedUserDetails.service';
import { FineractEntityService } from './apache-fineract-client/services/fineractEntity.service';
import { FixedDepositAccountService } from './apache-fineract-client/services/fixedDepositAccount.service';
import { FixedDepositAccountTransactionsService } from './apache-fineract-client/services/fixedDepositAccountTransactions.service';
import { FixedDepositProductService } from './apache-fineract-client/services/fixedDepositProduct.service';
import { FloatingRatesService } from './apache-fineract-client/services/floatingRates.service';
import { FundsService } from './apache-fineract-client/services/funds.service';
import { GeneralLedgerAccountService } from './apache-fineract-client/services/generalLedgerAccount.service';
import { GlobalConfigurationService } from './apache-fineract-client/services/globalConfiguration.service';
import { GroupsService } from './apache-fineract-client/services/groups.service';
import { GroupsLevelService } from './apache-fineract-client/services/groupsLevel.service';
import { GuarantorsService } from './apache-fineract-client/services/guarantors.service';
import { HolidaysService } from './apache-fineract-client/services/holidays.service';
import { HooksService } from './apache-fineract-client/services/hooks.service';
import { InstanceModeService } from './apache-fineract-client/services/instanceMode.service';
import { InterOperationService } from './apache-fineract-client/services/interOperation.service';
import { InterestRateChartService } from './apache-fineract-client/services/interestRateChart.service';
import { InterestRateSlabAKAInterestBandsService } from './apache-fineract-client/services/interestRateSlabAKAInterestBands.service';
import { JournalEntriesService } from './apache-fineract-client/services/journalEntries.service';
import { LikelihoodService } from './apache-fineract-client/services/likelihood.service';
import { ListReportMailingJobHistoryService } from './apache-fineract-client/services/listReportMailingJobHistory.service';
import { LoanChargesService } from './apache-fineract-client/services/loanCharges.service';
import { LoanCollateralService } from './apache-fineract-client/services/loanCollateral.service';
import { LoanCollateralManagementService } from './apache-fineract-client/services/loanCollateralManagement.service';
import { LoanDisbursementDetailsService } from './apache-fineract-client/services/loanDisbursementDetails.service';
import { LoanProductsService } from './apache-fineract-client/services/loanProducts.service';
import { LoanReschedulingService } from './apache-fineract-client/services/loanRescheduling.service';
import { LoanTransactionsService } from './apache-fineract-client/services/loanTransactions.service';
import { LoansService } from './apache-fineract-client/services/loans.service';
import { MakerCheckerOr4EyeFunctionalityService } from './apache-fineract-client/services/makerCheckerOr4EyeFunctionality.service';
import { MappingFinancialActivitiesToAccountsService } from './apache-fineract-client/services/mappingFinancialActivitiesToAccounts.service';
import { MeetingsService } from './apache-fineract-client/services/meetings.service';
import { MixMappingService } from './apache-fineract-client/services/mixMapping.service';
import { MixReportService } from './apache-fineract-client/services/mixReport.service';
import { MixTaxonomyService } from './apache-fineract-client/services/mixTaxonomy.service';
import { NotesService } from './apache-fineract-client/services/notes.service';
import { NotificationService } from './apache-fineract-client/services/notification.service';
import { OfficesService } from './apache-fineract-client/services/offices.service';
import { PasswordPreferencesService } from './apache-fineract-client/services/passwordPreferences.service';
import { PaymentTypeService } from './apache-fineract-client/services/paymentType.service';
import { PeriodicAccrualAccountingService } from './apache-fineract-client/services/periodicAccrualAccounting.service';
import { PermissionsService } from './apache-fineract-client/services/permissions.service';
import { PocketService } from './apache-fineract-client/services/pocket.service';
import { PovertyLineService } from './apache-fineract-client/services/povertyLine.service';
import { ProductMixService } from './apache-fineract-client/services/productMix.service';
import { ProductsService } from './apache-fineract-client/services/products.service';
import { ProvisioningCategoryService } from './apache-fineract-client/services/provisioningCategory.service';
import { ProvisioningCriteriaService } from './apache-fineract-client/services/provisioningCriteria.service';
import { ProvisioningEntriesService } from './apache-fineract-client/services/provisioningEntries.service';
import { RateService } from './apache-fineract-client/services/rate.service';
import { RecurringDepositAccountService } from './apache-fineract-client/services/recurringDepositAccount.service';
import { RecurringDepositAccountTransactionsService } from './apache-fineract-client/services/recurringDepositAccountTransactions.service';
import { RecurringDepositProductService } from './apache-fineract-client/services/recurringDepositProduct.service';
import { RepaymentWithPostDatedChecksService } from './apache-fineract-client/services/repaymentWithPostDatedChecks.service';
import { ReportMailingJobsService } from './apache-fineract-client/services/reportMailingJobs.service';
import { ReportsService } from './apache-fineract-client/services/reports.service';
import { RescheduleLoansService } from './apache-fineract-client/services/rescheduleLoans.service';
import { RolesService } from './apache-fineract-client/services/roles.service';
import { RunReportsService } from './apache-fineract-client/services/runReports.service';
import { SCHEDULERJOBService } from './apache-fineract-client/services/sCHEDULERJOB.service';
import { SMSService } from './apache-fineract-client/services/sMS.service';
import { SPMAPILookUpTableService } from './apache-fineract-client/services/sPMAPILookUpTable.service';
import { SavingsAccountService } from './apache-fineract-client/services/savingsAccount.service';
import { SavingsAccountTransactionsService } from './apache-fineract-client/services/savingsAccountTransactions.service';
import { SavingsChargesService } from './apache-fineract-client/services/savingsCharges.service';
import { SavingsProductService } from './apache-fineract-client/services/savingsProduct.service';
import { SchedulerService } from './apache-fineract-client/services/scheduler.service';
import { ScoreCardService } from './apache-fineract-client/services/scoreCard.service';
import { SearchAPIService } from './apache-fineract-client/services/searchAPI.service';
import { SelfAccountTransferService } from './apache-fineract-client/services/selfAccountTransfer.service';
import { SelfAuthenticationService } from './apache-fineract-client/services/selfAuthentication.service';
import { SelfClientService } from './apache-fineract-client/services/selfClient.service';
import { SelfDividendService } from './apache-fineract-client/services/selfDividend.service';
import { SelfLoanProductsService } from './apache-fineract-client/services/selfLoanProducts.service';
import { SelfLoansService } from './apache-fineract-client/services/selfLoans.service';
import { SelfRunReportService } from './apache-fineract-client/services/selfRunReport.service';
import { SelfSavingsAccountService } from './apache-fineract-client/services/selfSavingsAccount.service';
import { SelfSavingsProductsService } from './apache-fineract-client/services/selfSavingsProducts.service';
import { SelfScoreCardService } from './apache-fineract-client/services/selfScoreCard.service';
import { SelfServiceRegistrationService } from './apache-fineract-client/services/selfServiceRegistration.service';
import { SelfShareAccountsService } from './apache-fineract-client/services/selfShareAccounts.service';
import { SelfShareProductsService } from './apache-fineract-client/services/selfShareProducts.service';
import { SelfSpmService } from './apache-fineract-client/services/selfSpm.service';
import { SelfThirdPartyTransferService } from './apache-fineract-client/services/selfThirdPartyTransfer.service';
import { SelfUserService } from './apache-fineract-client/services/selfUser.service';
import { SelfUserDetailsService } from './apache-fineract-client/services/selfUserDetails.service';
import { ShareAccountService } from './apache-fineract-client/services/shareAccount.service';
import { SpmSurveysService } from './apache-fineract-client/services/spmSurveys.service';
import { StaffService } from './apache-fineract-client/services/staff.service';
import { StandingInstructionsService } from './apache-fineract-client/services/standingInstructions.service';
import { StandingInstructionsHistoryService } from './apache-fineract-client/services/standingInstructionsHistory.service';
import { SurveyService } from './apache-fineract-client/services/survey.service';
import { TaxComponentsService } from './apache-fineract-client/services/taxComponents.service';
import { TaxGroupService } from './apache-fineract-client/services/taxGroup.service';
import { TellerCashManagementService } from './apache-fineract-client/services/tellerCashManagement.service';
import { TwoFactorService } from './apache-fineract-client/services/twoFactor.service';
import { UserGeneratedDocumentsService } from './apache-fineract-client/services/userGeneratedDocuments.service';
import { UsersService } from './apache-fineract-client/services/users.service';
import { WorkingDaysService } from './apache-fineract-client/services/workingDays.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: []
})
export class apacheFineractClientApiModule {
    public static forRoot(configurationFactory: () => apacheFineractClientConfiguration): ModuleWithProviders<apacheFineractClientApiModule> {
        return {
            ngModule: apacheFineractClientApiModule,
            providers: [ { provide: apacheFineractClientConfiguration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: apacheFineractClientApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('apacheFineractClientApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
