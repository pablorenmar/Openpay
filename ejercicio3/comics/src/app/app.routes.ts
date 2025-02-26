import { RouterModule, Routes } from '@angular/router';
import { LogsComponent } from './components/logs/logs.component';
import { ListComicsComponent } from './components/list-comics/list-comics.component'
import { NgModule } from '@angular/core';
export const routes: Routes = [
    { path:'', component: ListComicsComponent },
    { path:'logs', component: LogsComponent }
];

@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})

export class AppRoutingModule { }
