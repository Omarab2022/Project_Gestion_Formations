import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './Components/dashboard/dashboard.component';
import { CandidatComponent } from './Components/candidat/candidat.component';
import { FormationsComponent } from './Components/formations/formations.component';
import { CertificationsComponent } from './Components/certifications/certifications.component';
import { HttpClientModule, provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    CandidatComponent,
    FormationsComponent,
    CertificationsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

  ],
  providers: [    provideHttpClient(withInterceptorsFromDi())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
