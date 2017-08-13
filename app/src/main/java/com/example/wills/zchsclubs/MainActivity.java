package com.example.wills.zchsclubs;

import android.widget.CheckBox;
import android.widget.RadioButton;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import static com.example.wills.zchsclubs.UtilityVars.IMSoccer;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        // @Override
        //  public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        // });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_home) {
            hideMenu();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new FirstFragment())
                    .commit();
        }
        else if (id == R.id.nav_catalogue) {
            hideMenu();
            Intent myIntent = new Intent(MainActivity.this, ListScroll.class);
            startActivity(myIntent);
        }
        else if (id == R.id.nav_quiz) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new Question1())
                    .commit();
            hideMenu();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void startCatalogue(View view){
            FragmentManager fragmentManager = getFragmentManager();

            switch (view.getId()) {
                case R.id.startCatalogue:
                    hideMenu();
                    Intent myIntent = new Intent(MainActivity.this, ListScroll.class);
                    startActivity(myIntent);
            }
    }


    public void startQuiz(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.startQuiz:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question1())
                        .commit();
                hideMenu();
        }
    }



    public void hideMenu(){
        View title = findViewById(R.id.Title);
        title.setVisibility(View.GONE);
        View about = findViewById(R.id.about);
        about.setVisibility(View.GONE);
        View logo = findViewById(R.id.imageView);
        logo.setVisibility(View.GONE);
        View codeon = findViewById(R.id.codeon);
        codeon.setVisibility(View.GONE);
        View startQuiz = findViewById(R.id.startQuiz);
        startQuiz.setVisibility(View.GONE);
        View startCatalogue = findViewById(R.id.startCatalogue);
        startCatalogue.setVisibility(View.GONE);
    }


    //**************************************************************************************
    //Quiz implementation
    //**************************************************************************************


    UtilityVars uv = new UtilityVars();

    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1o1://performing arts
                if (checked) {
                    //algorithm implementation
                    uv.SpringPlay = true;
                    uv.FallMusical = true;
                    uv.ZPACCrew = true;
                    uv.WinterGuard = false;
                    uv.VarsityDanceTeam = false;
                    uv.TriMMusicHonorSociety = false;
                    uv.SwingDanceClub = false;
                    uv.MovieClub = false;
                    uv.FilmClub = false;
                    uv.DramaClub = true;
                    uv.BookClub = false;
                    uv.ArtClub = false;
                    uv.AnimeMangaClub = false;
                    break;
                }
            case R.id.q1o2://literature/film
                if (checked) {
                    //algorithm implementation
                    uv.SpringPlay = false;
                    uv.FallMusical = false;
                    uv.ZPACCrew = false;
                    uv.WinterGuard = false;
                    uv.VarsityDanceTeam = false;
                    uv.TriMMusicHonorSociety = false;
                    uv.SwingDanceClub = false;
                    uv.MovieClub = false;
                    uv.FilmClub = true;
                    uv.DramaClub = false;
                    uv.BookClub = true;
                    uv.ArtClub = false;
                    uv.AnimeMangaClub = false;
                    break;
                }
            case R.id.q1o3://music/dance
                if (checked) {
                    //algorithm implementation
                    uv.SpringPlay = false;
                    uv.FallMusical = false;
                    uv.ZPACCrew = false;
                    uv.WinterGuard = true;
                    uv.VarsityDanceTeam = true;
                    uv.TriMMusicHonorSociety = true;
                    uv.SwingDanceClub = false;
                    uv.MovieClub = false;
                    uv.FilmClub = false;
                    uv.DramaClub = false;
                    uv.BookClub = false;
                    uv.ArtClub = false;
                    uv.AnimeMangaClub = false;
                    break;
                }
            case R.id.q1o4://visual arts
                if (checked) {
                    //algorithm implementation
                    uv.SpringPlay = false;
                    uv.FallMusical = false;
                    uv.ZPACCrew = false;
                    uv.WinterGuard = false;
                    uv.VarsityDanceTeam = false;
                    uv.TriMMusicHonorSociety = false;
                    uv.SwingDanceClub = false;
                    uv.MovieClub = false;
                    uv.FilmClub = false;
                    uv.DramaClub = false;
                    uv.BookClub = false;
                    uv.ArtClub = true;
                    uv.AnimeMangaClub = true;
                    break;
                }
            case R.id.q1o5://visual arts
                if (checked) {
                    //algorithm implementation
                    uv.SpringPlay = false;
                    uv.FallMusical = false;
                    uv.ZPACCrew = false;
                    uv.WinterGuard = false;
                    uv.VarsityDanceTeam = false;
                    uv.TriMMusicHonorSociety = false;
                    uv.SwingDanceClub = false;
                    uv.MovieClub = false;
                    uv.FilmClub = false;
                    uv.DramaClub = false;
                    uv.BookClub = false;
                    uv.ArtClub = false;
                    uv.AnimeMangaClub = false;
                    break;
                }
        }

    }


    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2o1:
                if (checked) {//playing sports
                    //algorithm implementation
                    uv.FCA = false;
                    IMSoccer = true;
                    uv.IMBasketball = true;
                    uv.IMVolleyball = true;
                    uv.IMDodgeball = true;
                    uv.Rugby = true;
                    uv.PingPongClub = false;
                    uv.YogaClub = false;
                    uv.ZSN = false;
                    break;
                }
            case R.id.q2o2:
                if (checked) {//relaxed sports-related activities
                    //algorithm implementation
                    uv.FCA = false;
                    IMSoccer = false;
                    uv.IMBasketball = false;
                    uv.IMVolleyball = false;
                    uv.IMDodgeball = false;
                    uv.Rugby = false;
                    uv.PingPongClub = true;
                    uv.YogaClub = true;
                    uv.ZSN = false;
                    break;
                }
            case R.id.q2o3:
                if (checked) {//sports journalism
                    //algorithm implementation
                    uv.FCA = false;
                    IMSoccer = false;
                    uv.IMBasketball = false;
                    uv.IMVolleyball = false;
                    uv.IMDodgeball = false;
                    uv.Rugby = false;
                    uv.PingPongClub = false;
                    uv.YogaClub = false;
                    uv.ZSN = true;
                    break;
                }
            case R.id.q2o4:
                if (checked) {//interacting with fellow athletes
                    //algorithm implementation
                    uv.FCA = true;
                    IMSoccer = false;
                    uv.IMBasketball = false;
                    uv.IMVolleyball = false;
                    uv.IMDodgeball = false;
                    uv.Rugby = false;
                    uv.PingPongClub = false;
                    uv.YogaClub = false;
                    uv.ZSN = false;
                    break;
                }
            case R.id.q2o5:
                if (checked) {
                    //algorithm implementation
                    uv.FCA = false;
                    IMSoccer = false;
                    uv.IMBasketball = false;
                    uv.IMVolleyball = false;
                    uv.IMDodgeball = false;
                    uv.Rugby = false;
                    uv.PingPongClub = false;
                    uv.YogaClub = false;
                    uv.ZSN = false;
                    break;
                }
        }
    }
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q3o1:
                if (checked) {//US politics
                    //algorithm implementation
                    uv.DiversityCouncil = false;
                    uv.EqualRightsClub = false;
                    uv.GSA = false;
                    uv.LesFemmes = false;
                    uv.ModelUN = false;
                    uv.OperationHonduras = false;
                    uv.ProjectGreen = false;
                    uv.StudentsForLife = false;
                    uv.AnimalRightsClub = false;
                    uv.YoungDemocrats = true;
                    uv.YoungRepublicans = true;
                    break;
                }
            case R.id.q3o2:
                if (checked) {//international relations
                    //algorithm implementation
                    uv.DiversityCouncil = false;
                    uv.EqualRightsClub = false;
                    uv.GSA = false;
                    uv.LesFemmes = false;
                    uv.ModelUN = true;
                    uv.OperationHonduras = true;
                    uv.ProjectGreen = false;
                    uv.StudentsForLife = false;
                    uv.AnimalRightsClub = false;
                    uv.YoungDemocrats = false;
                    uv.YoungRepublicans = false;
                    break;
                }
            case R.id.q3o3:
                if (checked) {//protecting nature and the environment
                    uv.DiversityCouncil = false;
                    uv.EqualRightsClub = false;
                    uv.GSA = false;
                    uv.LesFemmes = false;
                    uv.ModelUN = false;
                    uv.OperationHonduras = false;
                    uv.ProjectGreen = true;
                    uv.StudentsForLife = false;
                    uv.AnimalRightsClub = true;
                    uv.YoungDemocrats = false;
                    uv.YoungRepublicans = false;
                    //algorithm implementation
                    break;
                }
            case R.id.q3o4:
                if (checked) {//equal rights
                    //algorithm implementation
                    uv.DiversityCouncil = true;
                    uv.EqualRightsClub = true;
                    uv.GSA = true;
                    uv.LesFemmes = true;
                    uv.ModelUN = false;
                    uv.OperationHonduras = false;
                    uv.ProjectGreen = false;
                    uv.StudentsForLife = false;
                    uv.AnimalRightsClub = false;
                    uv.YoungDemocrats = false;
                    uv.YoungRepublicans = false;
                    break;
                }
            case R.id.q3o5:
                if (checked) {//equal rights
                    //algorithm implementation
                    uv.DiversityCouncil = false;
                    uv.EqualRightsClub = false;
                    uv.GSA = false;
                    uv.LesFemmes = false;
                    uv.ModelUN = false;
                    uv.OperationHonduras = false;
                    uv.ProjectGreen = false;
                    uv.StudentsForLife = false;
                    uv.AnimalRightsClub = false;
                    uv.YoungDemocrats = false;
                    uv.YoungRepublicans = false;
                    break;
                }
        }
    }
    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4o1:
                if (checked && nextClicked) {//helping others
                    //algorithm implementation
                    uv.BestBuddies = true;
                    uv.EagleKickoffMentors = true;
                    uv.Harbinger = false;
                    uv.KeyClub = false;
                    uv.NHS = false;
                    uv.PromCommittee = false;
                    uv.StudentCouncil = false;
                    uv.TimmyClub = false;
                    uv.Yearbook = false;
                    uv.ZionsvilleStudentAmbassadors = true;
                    uv.InteractClub = false;
                    break;
                }
            case R.id.q4o2:
                if (checked && nextClicked) {//community service
                    //algorithm implementation
                    uv.BestBuddies = false;
                    uv.EagleKickoffMentors = false;
                    uv.Harbinger = false;
                    uv.KeyClub = true;
                    uv.NHS = true;
                    uv.PromCommittee = false;
                    uv.StudentCouncil = false;
                    uv.TimmyClub = true;
                    uv.Yearbook = false;
                    uv.ZionsvilleStudentAmbassadors = false;
                    uv.InteractClub = true;
                    break;
                }
            case R.id.q4o3:
                if (checked && nextClicked) {//school publications
                    //algorithm implementation
                    uv.BestBuddies = false;
                    uv.EagleKickoffMentors = false;
                    uv.Harbinger = true;
                    uv.KeyClub = false;
                    uv.NHS = false;
                    uv.PromCommittee = false;
                    uv.StudentCouncil = false;
                    uv.TimmyClub = false;
                    uv.Yearbook = true;
                    uv.ZionsvilleStudentAmbassadors = false;
                    uv.InteractClub = false;
                    break;
                }
            case R.id.q4o4:
                if (checked && nextClicked) {//school dances and activities
                    //algorithm implementation
                    uv.BestBuddies = false;
                    uv.EagleKickoffMentors = false;
                    uv.Harbinger = false;
                    uv.KeyClub = false;
                    uv.NHS = false;
                    uv.PromCommittee = true;
                    uv.StudentCouncil = true;
                    uv.TimmyClub = false;
                    uv.Yearbook = false;
                    uv.ZionsvilleStudentAmbassadors = false;
                    uv.InteractClub = false;
                    break;
                }
            case R.id.q4o5:
                if (checked && nextClicked) {//school dances and activities
                    //algorithm implementation
                    uv.BestBuddies = false;
                    uv.EagleKickoffMentors = false;
                    uv.Harbinger = false;
                    uv.KeyClub = false;
                    uv.NHS = false;
                    uv.PromCommittee = false;
                    uv.StudentCouncil = true;
                    uv.TimmyClub = false;
                    uv.Yearbook = false;
                    uv.ZionsvilleStudentAmbassadors = false;
                    uv.InteractClub = false;
                    break;
                }
        }
    }
    public void onRadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q5o1:
                if (checked) {//math/science
                    //algorithm implementation
                    uv.ThreeDPrintingClub = true;
                    uv.BPA = false;
                    uv.ChineseClub = false;
                    uv.ChineseHonorSociety = false;
                    uv.FrenchClub = false;
                    uv.FrenchNationalHonorSociety = false;
                    uv.InvestorsClub = false;
                    uv.PsychologyClub = true;
                    uv.MuAlphaTheta = true;
                    uv.QuizBowl = false;
                    uv.RoboticsClub = true;
                    uv.SalesEntrepeneurshipLeadership = false;
                    uv.ScienceClub = true;
                    uv.SociedadHonoriaHispanica = false;
                    uv.SpanishCinema = false;
                    uv.SpanishClub = false;
                    uv.SpeechAndDebate = false;
                    uv.WomenInEngineering = true;
                    break;
                }
            case R.id.q5o2://business
                if (checked) {
                    //algorithm implementation
                    uv.ThreeDPrintingClub = false;
                    uv.BPA = true;
                    uv.ChineseClub = false;
                    uv.ChineseHonorSociety = false;
                    uv.FrenchClub = false;
                    uv.FrenchNationalHonorSociety = false;
                    uv.InvestorsClub = true;
                    uv.PsychologyClub = false;
                    uv.MuAlphaTheta = false;
                    uv.QuizBowl = false;
                    uv.RoboticsClub = false;
                    uv.SalesEntrepeneurshipLeadership = true;
                    uv.ScienceClub = false;
                    uv.SociedadHonoriaHispanica = false;
                    uv.SpanishCinema = false;
                    uv.SpanishClub = false;
                    uv.SpeechAndDebate = false;
                    uv.WomenInEngineering = false;
                    break;
                }
            case R.id.q5o3://foreign languages
                if (checked) {
                    //algorithm implementation
                    uv.ThreeDPrintingClub = false;
                    uv.BPA = false;
                    uv.ChineseClub = true;
                    uv.ChineseHonorSociety = true;
                    uv.FrenchClub = true;
                    uv.FrenchNationalHonorSociety = true;
                    uv.InvestorsClub = false;
                    uv.PsychologyClub = false;
                    uv.MuAlphaTheta = false;
                    uv.QuizBowl = false;
                    uv.RoboticsClub = false;
                    uv.SalesEntrepeneurshipLeadership = false;
                    uv.ScienceClub = false;
                    uv.SociedadHonoriaHispanica = true;
                    uv.SpanishCinema = true;
                    uv.SpanishClub = true;
                    uv.SpeechAndDebate = false;
                    uv.WomenInEngineering = false;
                    break;
                }
            case R.id.q5o4://no preference but still like academics
                if (checked) {
                    //algorithm implementation
                    uv.ThreeDPrintingClub = false;
                    uv.BPA = false;
                    uv.ChineseClub = false;
                    uv.ChineseHonorSociety = false;
                    uv.FrenchClub = false;
                    uv.FrenchNationalHonorSociety = false;
                    uv.InvestorsClub = false;
                    uv.PsychologyClub = false;
                    uv.MuAlphaTheta = false;
                    uv.QuizBowl = true;
                    uv.RoboticsClub = false;
                    uv.SalesEntrepeneurshipLeadership = false;
                    uv.ScienceClub = false;
                    uv.SociedadHonoriaHispanica = false;
                    uv.SpanishCinema = false;
                    uv.SpanishClub = false;
                    uv.SpeechAndDebate = true;
                    uv.WomenInEngineering = false;
                    break;
                }
            case R.id.q5o5:
                if (checked) {
                    //algorithm implementation
                    uv.ThreeDPrintingClub = false;
                    uv.BPA = false;
                    uv.ChineseClub = false;
                    uv.ChineseHonorSociety = false;
                    uv.FrenchNationalHonorSociety = false;
                    uv.FrenchClub = false;
                    uv.InvestorsClub = false;
                    uv.PsychologyClub = false;
                    uv.MuAlphaTheta = false;
                    uv.QuizBowl = false;
                    uv.RoboticsClub = false;
                    uv.SalesEntrepeneurshipLeadership = false;
                    uv.ScienceClub = false;
                    uv.SociedadHonoriaHispanica = false;
                    uv.SpanishCinema = false;
                    uv.SpanishClub = false;
                    uv.SpeechAndDebate = false;
                    uv.WomenInEngineering = false;
                    break;
                }
        }
    }
    public void onRadioButtonClicked6(View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) { //Monday
            case R.id.q6o1:
                if (checked) {
                    //algorithm implementation
                    uv.OperationHonduras = false;
                    break;
                }
            case R.id.q6o2: //Tuesday
                if (checked) {
                    //algorithm implementation
                    uv.FrenchClub = false;
                    break;
                }
            case R.id.q6o3: //Wednesday
                if (checked) {
                    //algorithm implementation
                    uv.ArtClub = false;
                    uv.BookClub = false;
                    uv.ChineseClub = false;
                    uv.FCA = false;
                    uv.ModelUN = false;
                    break;
                }
            case R.id.q6o4: //Thursday
                if (checked) {
                    //algorithm implementation
                    if(uv.KeyClub = true){uv.KeyClub = false;}
                    break;
                }
            case R.id.q6o5: //Friday
                if (checked) {
                    uv.AnimeMangaClub = false;
                    uv.StudentCouncil = false;
                    uv.SwingDanceClub = false;
                    break;
                }
            case R.id.q6o6: //Weekends
                if (checked) {
                    //algorithm implementation
                    uv.ModelUN = false;
                    break;
                }
        }
    }
    public void onRadioButtonClicked7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q7yes:
                if (checked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q7no:
                if (checked) {
                    //algorithm implementation
                    uv.ArtClub = false;
                    uv.IMDodgeball = false;
                    uv.IMVolleyball = false;
                    uv.IMSoccer = false;
                    uv.IMBasketball = false;
                    uv.ArtClub = false;
                    uv.ThreeDPrintingClub = false;
                    uv.ModelUN = false;
                    break;
                }

        }
    }
    public void onRadioButtonClicked8(View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q8o1://fall
                if (checked) {
                    //algorithm implementation
                    uv.IMSoccer = false;
                    uv.FallMusical = false;
                    break;
                }
            case R.id.q8o2://winter
                if (checked) {
                    //algorithm implementation
                    uv.IMBasketball = false;
                    uv.IMVolleyball = false;
                    break;
                }
            case R.id.q8o3://spring
                if (checked) {
                    //algorithm implementation
                    uv.IMDodgeball = false;
                    uv.SpringPlay = false;
                    break;
                }
        }
    }
    public void onRadioButtonClicked9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q9o1:
                if (checked) {

                    //algorithm implementation
                        uv.NHS = false;
                    break;
                }
            case R.id.q9o2:
                if (checked) {
                    //algorithm implementation
                       uv.NHS = false;
                    break;
                }
            case R.id.q9o3:
                if (checked) {
                    //fragmentManager.beginTransaction()
                    //        .replace(R.id.content_frame
                    //                , new foreinlang())
                    //        .commit();
                    break;
                }
            case R.id.q9o4:
                if (checked) {
                    //algorithm implementation
                    break;
                }
        }
    }


    public void onClick1(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next1:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question2())
                        .commit();
        }
    }
    public void onClick2(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next2:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question3())
                        .commit();
        }
    }
    public void onClick3(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next3:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question4())
                        .commit();
        }
    }
    public void onClick4(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next4:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question5())
                        .commit();
        }
    }
    public void onClick5(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next5:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question6())
                        .commit();
        }
    }
    public void onClick6(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next6:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question7())
                        .commit();
        }
    }
    public void onClick7(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next7:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question8())
                        .commit();
        }
    }
    public void onClick8(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next8:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question9())
                        .commit();
        }
    }

    //public void onClickFL(View view){
    //    switch (view.getId()) {
    //        case R.id.nextFL:
    //            Intent myIntent = new Intent(MainActivity.this, DisplayResults.class);
    //            startActivity(myIntent);
    //    }
   // }


    public void revOnClick2(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back2:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question1())
                        .commit();
        }
    }
    public void revOnClick3(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back3:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question2())
                        .commit();
        }
    }
    public void revOnClick4(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back4:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question3())
                        .commit();
        }
    }
    public void revOnClick5(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back5:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question4())
                        .commit();
        }
    }
    public void revOnClick6(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back6:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question5())
                        .commit();
        }
    }
    public void revOnClick7(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back7:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question6())
                        .commit();
        }
    }
    public void revOnClick8(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back8:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question7())
                        .commit();
        }
    }
    public void revOnClick9(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back9:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question8())
                        .commit();
        }
    }

    public void submit(View view) {

        //boolean checked = ((RadioButton) view).isChecked();
        FragmentManager fragmentManager = getFragmentManager();

        //check if the 'next' button has been clicked

        // Check which radio button was clicked
        //switch (view.getId()) {
        //    case R.id.q9o3:
        //        if (checked) {
        //            fragmentManager.beginTransaction()
        //                    .replace(R.id.content_frame
        //                            , new foreinlang())
        //                    .commit();
        //            break;
        //        }
        //}
        switch (view.getId()) {
            case R.id.next9:
                Intent myIntent = new Intent(MainActivity.this, DisplayResults.class);
                startActivity(myIntent);
        }
    }


}