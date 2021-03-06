import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import {
    MatButtonModule,
    MatIconModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatSidenavModule,
    MatToolbarModule,
    MatCardModule
} from '@angular/material';
 
import { TranslateModule } from '@ngx-translate/core';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { TopnavComponent } from './components/topnav/topnav.component';
import { LayoutRoutingModule } from './layout-routing.module';
import { LayoutComponent } from './layout.component'; 

import { FlexLayoutModule } from '@angular/flex-layout'; 

import {NgxMaterialTimepickerModule} from 'ngx-material-timepicker';
@NgModule({
    imports: [
        CommonModule,
        LayoutRoutingModule,
        MatToolbarModule,
        MatButtonModule,
        MatSidenavModule,
        MatIconModule,
        MatInputModule,
        MatMenuModule,
        MatListModule,
        TranslateModule,
        MatCardModule,
        NgxMaterialTimepickerModule,
        FlexLayoutModule.withConfig({addFlexToParent: false})
    ],
    declarations: [LayoutComponent, TopnavComponent, SidebarComponent]
})
export class LayoutModule {}
