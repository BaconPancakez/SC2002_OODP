classDiagram
    class User {
        <<abstract>>
        -nric: String
        -password: String
        -age: int
        -maritalStatus: String
        +viewDashboard(): void
    }

    class Project {
        <<abstract>>
        +createProject(): void
        +editProject(): void
        +deleteProject(): void
        +toggleVisibility(): void
    }

    class Application {
        <<abstract>>
        +viewApplication(): void
        +approveApplication(): void
        +rejectApplication(): void
    }

    class IView {
        <<interface>>
        +displayMenu(): void
        +showMessage(msg: String): void
    }

    class HDBManager
    User <|-- HDBManager

    class LoginController {
        +login(nric: String, password: String): User
    }

    class Router {
        +routeUser(user: User): void
    }

    LoginController --> User : returns
    Router --> HDBManager : type check
    Router --> ManagerView : launches

    class ManagerView {
        +displayMenu(): void
        +promptProjectDetails(): ProjectListing
        +showReport(): void
        +showMessage(msg: String): void
    }

    IView <|.. ManagerView

    class ProjectController {
        +createProject(): void
        +editProject(): void
        +deleteProject(): void
        +toggleVisibility(): void
    }

    class ApplicationController {
        +approveApplication(): void
        +rejectApplication(): void
        +approveWithdrawal(): void
        +rejectWithdrawal(): void
    }

    class OfficerRegistrationController {
        +viewApplications(): List<OfficerApplicant>
        +approveApplication(): void
        +rejectApplication(): void
    }

    class ReportController {
        +generateReport(filters: String): String
    }

    class EnquiryController {
        +viewAll(): List<Enquiry>
        +reply(e: Enquiry, msg: String): void
    }

    class ProjectListing {
        -projectName: String
        -neighborhood: String
        -applicationOpenDate: Date
        -applicationCloseDate: Date
        -visibility: boolean
        -flats: List<Flat>
        -manager: HDBManager
        -officerSlots: int
    }

    class BTOApplication {
        -flatType: String
        -status: Status
        -project: ProjectListing
        -applicantNRIC: String
    }

    class OfficerApplicant {
        -nric: String
        -appliedProject: ProjectListing
    }

    class Enquiry {
        -content: String
        -authorNRIC: String
        -response: String
    }

    class Flat {
        -type: String
        -totalUnits: int
        -availableUnits: int
    }

    class Status {
        <<enumeration>>
        PENDING
        SUCCESSFUL
        UNSUCCESSFUL
        BOOKED
    }

    Project <|-- ProjectListing
    Application <|-- BTOApplication

    ProjectListing "1" *-- "many" Flat : has
    ProjectListing "1" o-- "*" Enquiry : receives
    BTOApplication --> ProjectListing : applied to
    BTOApplication --> Status
    OfficerApplicant --> ProjectListing

    ManagerView ..> ProjectController : uses
    ManagerView ..> ApplicationController : uses
    ManagerView ..> ReportController : uses
    ManagerView ..> EnquiryController : uses
    ManagerView ..> OfficerRegistrationController : uses
