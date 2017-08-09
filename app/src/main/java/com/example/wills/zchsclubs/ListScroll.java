package com.example.wills.zchsclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListScroll extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    ArrayList<String> myData;
    ArrayAdapter<String> myArrayAdapter;
    TextView myTextView;













    //*****************************************************
    //List initialization
    //*****************************************************

    @Override
    protected void onCreate(Bundle savedInsuranceState) {
        super.onCreate(savedInsuranceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.catalogue);


        listView = (ListView) findViewById(R.id.clublist);
        myTextView = (TextView) findViewById(R.id.clubinformation);
        myData = new ArrayList<String>();

        myData.add("3D Printing Club");
        myData.add("Animal Rights Club");
        myData.add("Anime and Manga Club");
        myData.add("Art Club");
        myData.add("Best Buddies");
        myData.add("Book Club");
        myData.add("Business Professionals of America");
        myData.add("Capernaum");
        myData.add("Chinese Club");
        myData.add("Diversity Council");
        myData.add("Drama Club");
        myData.add("Eagle Kickoff Mentors");
        myData.add("Equal Rights Club");
        myData.add("Fall Musical");
        myData.add("FCA");
        myData.add("Film Club");
        myData.add("French Club");
        myData.add("Gay Straight Alliance");
        myData.add("Harbinger");
        myData.add("Interact Club");
        myData.add("Intramural Soccer");
        myData.add("Intramural Volleyball");
        myData.add("Intramural Basketball");
        myData.add("Intramural Dodgeball");
        myData.add("Investor's Club");
        myData.add("Key Club");
        myData.add("Les Femmes");
        myData.add("Model UN");
        myData.add("Movie Club");
        myData.add("Mu Alpha Theta");
        myData.add("National Honor Society");
        myData.add("Nature/Adventure Club");
        myData.add("Operation: Honduras");
        myData.add("Phil and Theo");
        myData.add("Ping Pong Club");
        myData.add("Project Green");
        myData.add("Prom Committee");
        myData.add("Psychology Club");
        myData.add("Quiz Bowl");
        myData.add("Robotics Club");
        myData.add("Rugby");
        myData.add("Sales, Entrepreneurship, and Leadership");
        myData.add("Science Club");
        myData.add("Spanish Cinema");
        myData.add("Spanish Club");
        myData.add("Speech and Debate");
        myData.add("Spring Play");
        myData.add("Student Council");
        myData.add("Students for Life");
        myData.add("Swing Dance Club");
        myData.add("Timmy Club");
        myData.add("Tri M Music Honor Society");
        myData.add("Varsity Dance Team");
        myData.add("Winter Guard");
        myData.add("Women in Engineering");
        myData.add("Yearbook");
        myData.add("Yoga Club");
        myData.add("Young Democrats");
        myData.add("Young Republicans");
        myData.add("Zionsville Sports Network");
        myData.add("Zionsville Student Amabassadors");
        myData.add("ZPAC Crew");

        myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myData);

        listView.setAdapter(myArrayAdapter);
        listView.setOnItemClickListener(this);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent myIntent = new Intent(ListScroll.this, MainActivity.class);
                startActivity(myIntent);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String myItemSelected;
        myItemSelected = (String) parent.getItemAtPosition(position).toString();
        View startList = findViewById(R.id.startList);
        startList.setVisibility(View.GONE);
        if(myItemSelected == "3D Printing Club") {
            myTextView.setText("No description available, please contact Mr. Mulholland for more information.");
        }if(myItemSelected == "Animal Rights Club"){
            myTextView.setText("No description available, please contact Mrs. Carey for more information.");
        }if(myItemSelected == "Anime and Manga Club"){
            myTextView.setText("The Anime and Manga Club is for those who enjoy the stories and characters from Anime and Manga.  The club meets weekly on Fridays.  Students will be engaged in watching Anime, games and other activities.  All are welcome.");
        }if(myItemSelected == "Art Club"){
            myTextView.setText("Art Club is designed for all levels of creative students.  We work with a variety of materials that students are interested in experiencing for the first time.  Students suggest future projects and plan out all of the demonstrations for the club meetings.  Art Club also loves to work outside of the classroom on community murals or props for organizations needing a little extra creativity.  Art Club meets every other Wednesday from 3:40 - 4:30. Dues are $20 which inclues a t-shirt and all supplies for the year.");
        }if(myItemSelected == "Best Buddies"){
            myTextView.setText("No description available, please contact Mrs. O'Donnell or Mrs. Cohen for more information");
        }if(myItemSelected == "Book Club"){
            myTextView.setText("The ZCHS Book Club allows students to meet with their peers in a relaxed and respectful atmosphere to discuss books and socialize. Members share viewpoints, ideas, and feelings during the book discussions. The club usually meets every other Wednesday from 3:30 - 4:30 in the high school library media center. Any student is welcome to participate, and members need not read every book or come to every meeting in order to be a part of the club. Books are selected by members, and we read about 12 books throughout the course of the school year, including adult and young adult fiction and nonfiction titles in a variety of genres. Copies are provided to members to borrow for free, courtesy of the Hussey-Mayfield Memorial Library. ");
        }if(myItemSelected == "Business Professionals of America"){
            myTextView.setText("Business Professionals of America (BPA) is a co-curricular business club that further enhances our classes by providing students with a real-life, authentic learning environment that extends well beyond the classroom. BPA prepares students for the business world through the skills of leadership, citizenship, academic, and technology. One of the highlights of the organization are its leadership conferences, enabling students to network with both professionals and students, attend leadership workshops, and compete in events against other schools from around the area, state, and country in events based on the following business categories: Finance, Administration, Information Systems, Digital Communication, and Marketing.");
        }if(myItemSelected == "Capernaum Club"){
            myTextView.setText("No description available, please contact Mrs. Edgell for more information.");
        }if(myItemSelected == "Chinese Club"){
            myTextView.setText("It is not necessary to be in Chinese class or know Chinese to be in Chinese Club!  We learn about the language, the culture, eat Chinese food, and participate in fun activities and Chinese games.  Everyone is welcome!  We meet on the third Wednesday of each month.");
        }if(myItemSelected == "Chinese Honor Society"){
            myTextView.setText("This is a club for motivated learners of the Chinese Language.  Members will be given the opportunity and expected to participate in extra-curricular competitions and Chinese cultural events.  Members will be encouraged to take active service roles within the Chinese community, and supply out-of-school academic help to those just beginning to learn the Chinese language.  To apply, you must have taken at least 3 semesters of Chinese, while maintaining above a B-average.");
        }if(myItemSelected == "Diversity Council"){
            myTextView.setText("No description available, please contact Mrs. Conrad for more information.");
        }if(myItemSelected == "Do Something Club"){
            myTextView.setText("No description available, please contact Mrs. Thomas for more information.");
        }if(myItemSelected == "Drama Club"){
            myTextView.setText("No description available, please contact Mrs. Morario for more information");
        }if(myItemSelected == "Eagle Kickoff Mentors"){
            myTextView.setText("The EKOM's plan the Freshman Kick Off day for all Freshmen and new students in August.  The EKOM's also have one follow-up with Freshmen early in the year to check on their progress.  In addition, some EKOM's volunteer to connect 1 on 1 with Freshman students that are struggling in one way or another.\n" +
                    " \n" +
                    "The application to become an EKOM club member occurs in the spring of the year and is open to all incoming Sophomores, Juniors, and Seniors.");
        }if(myItemSelected == "Equal Rights Club"){
            myTextView.setText("No description available, please contact Mrs. Craven for more information.");
        }if(myItemSelected == "Fall Musical"){
            myTextView.setText("The fall musical is a place for students who have a love for theater. This year's show will be Les Miserables, and will be directed by Mikayla Koharchik. Students can audition for a role in the production or apply for a position on crew.");
        }if(myItemSelected == "FCA"){
            myTextView.setText("FCA presents athletes and coaches, and all whom they influence, the challenge and adventure of living out their faith through their sport and sports community, as well as provide them the opportunity to serve their team, their school, and their community. FCA meets Wednesdays from 7:30 - 7:55am in the back of the cafeteria. Please confirm meeting dates and times with club sponsor.");
        }if(myItemSelected == "Film Club"){
            myTextView.setText("No description available, please contact Mrs. Overberg for more information.");
        }if(myItemSelected == "French Club"){
            myTextView.setText("The French Club is an organization that goes beyond the classroom to learn more about francophone culture.  Most students are or have been enrolled in French class but we invite all students who are interested in learning about French in the world to attend.  We meet the second Tuesday of every month after school in the LGI.  Meeting include information, music, activities, and French food.  We have a few evening outings per year too.  Please plan to join us.");
        }if(myItemSelected == "French National Honor Society"){
            myTextView.setText("There is no information for this club yet.");
        }if(myItemSelected == "Gay Straight Alliance"){
            myTextView.setText("No description available, please contact Mrs. Craven for more information.");
        }if(myItemSelected == "Harbinger"){
            myTextView.setText("The Harbinger is a student-run publication that produces a magazine, a website, and the Friday Morning Announcements. Prerequisites include Journalism 1 or Mass Media.");
        }if(myItemSelected == "Interact Club"){
            myTextView.setText("Interact Club is an international service club that works with the local Rotary Club.  They raise money and collect items for non-profits locally and all over the world.");
        }if(myItemSelected == "Intramural Soccer"){
            myTextView.setText("Intramurals are a fun way to stay active and play sports! The IM soccer season is in the fall, and there is a $20 fee.");
        }if(myItemSelected == "Intramural Volleyball"){
            myTextView.setText("Intramurals are a fun way to stay active and play sports! The IM volleyball season is in the winter, and there is a $20 fee.");
        }if(myItemSelected == "Intramural Basketball"){
            myTextView.setText("Intramurals are a fun way to stay active and play sports! The IM basketball season is in the winter, and there is a $20 fee.");
        }if(myItemSelected == "Intramural Dodgeball"){
            myTextView.setText("Intramurals are a fun way to stay active and play sports! The IM dodgeball season is in the spring, and there is a $20 fee.");
        }if(myItemSelected == "Investor's Club"){
            myTextView.setText("No description available, please contact Mr. Moser for more information.");
        }if(myItemSelected == "Key Club"){
            myTextView.setText("Key Club is a community service organization that is an extension of Kiwanis International.  Key Club meets 2 times a month. They raise money for UNICEF, have a blood drive each year, and volunteer for other service projects in the community throughout the school year.  Meetings are Thursday mornings at 7:40 AM in the main campus LGI.  Please confirm specific meeting dates and times with the club sponsor.");
        }if(myItemSelected == "Les Femmes"){
            myTextView.setText("Les Femmes is Zionsville's Women's Studies Club. Members discuss current issues affecting women both locally and globally, as well as funding loans to women entrepreneurs through Kiva microfinance program and supporting the Julian Center for victims of domestic abuse.");
        }if(myItemSelected == "Model UN"){
            myTextView.setText("In the Model UN club, students role-play various countries in the world.  They learn about the history, politics, and foreign policies of several countries and begin to understand the importance of the United Nations in the world today.  Students become familiar with several international problems or issues and experience the give and take of diplomacy as they attempt to pass resolutions in their councils.  The model provides an opportunity for them to improve their public speaking and debate skills and to learn some parliamentary procedure, as well as how to learn how to work constructively in a group. Meetings are on Wednesdays, and there are 5 weekend conferences at various colleges throughout the Midwest.");
        }if(myItemSelected == "Movie Club"){
            myTextView.setText("No description available, please contact Mrs. Sarcona for more information.");
        }if(myItemSelected == "Mu Alpha Theta"){
            myTextView.setText("No description available, please contact Mr. Moser for more information.");
        }if(myItemSelected == "National Honor Society"){
            myTextView.setText("As a member of NHS, you will be required to attend monthly meetings and to accumulate a minimum of 10 service hours per semester.  If you are unwilling to do these things, please do not apply. The application process is open to sophomores and juniors only, and more details can be found on the ZCHS website.");
        }if(myItemSelected == "Nature/Adventure Club"){
            myTextView.setText("No description available, please contact Mrs. Benson for more information.");
        }if(myItemSelected == "Operation: Honduras"){
            myTextView.setText("The Operation: Honduras Club was started by students in 2005 as a way to support and encourage Honduran children in 6 rural communites to attain a high level of education and personal health in order to affect positive change in these areas and the country at large.  The Op:H Club sends aid to underserved children in the form of personal hygiene items, school supplies and sports equipment.  The club also completes larger-scale fundraising projects to build and renovate dynamic classroom spaces, sanitary restrooms, and functioning kitchens and libraries. This club is open to any ZCHS student!  Club dues are $5.00/year.  Students may join at any point during the school year.  Meetings are held every other Monday at 3:25 PM in room 708.");
        }if(myItemSelected == "Phil and Theo"){
            myTextView.setText("We discuss life's biggest questions and try to find their answers. Depp discussions and food are always present, and everyone is welcome to respectfully share their opinions and learn about others' views for a variety of different topics chosen every week! Meetings are every Thursday from 3:30-4:30. Please contact Mrs. Carey for more information.");
        }if(myItemSelected == "Ping Pong Club"){
            myTextView.setText("No description available, please contact Mrs. Muniz-Peredo for more information.");
        }if(myItemSelected == "Project Green"){
            myTextView.setText("No description available, please contact Mr. Page for more information.");
        }if(myItemSelected == "Prom Committee"){
            myTextView.setText("No description available, please contact Mrs. Dixon for more information.");
        }if(myItemSelected == "Psychology Club"){
            myTextView.setText("This group sponsors fun and engaging psychology-related activities for current and former Psychology students, as well as other students with an interest in the subject.");
        }if(myItemSelected == "Quiz Bowl"){
            myTextView.setText("Quiz Bowl is Jeopardy-type academic competition.  ZCHS competes against local teams and places first in our White River Academic League in 2014 and fourth-place in the state tournament.  A subset of the team participates on the Brain Game, sponsored by Westfield Insurance, which is televised locally by WTHR Channel 13.  ZCHS was a finalist in 2015, winning a $3,000 prize for the school.");
        }if(myItemSelected == "Robotics Club"){
            myTextView.setText("Club members build and program robots to compete in events throughout the school year. Meetings are on Tuesdays and Thursdays.");
        }if(myItemSelected == "Rugby"){
            myTextView.setText("No description available, please contact Mr. Shiller for more information.");
        }if(myItemSelected == "Sales, Entrepreneurship, and Leadership"){
            myTextView.setText("No description available, please contact Mr. Moser for more information.");
        }if(myItemSelected == "Science Club"){
            myTextView.setText("No description available, please contact Mrs. Bing for more information.");
        }if(myItemSelected == "Spanish Club"){
            myTextView.setText("Spanish club is open to all students! Members do cultural activities, eat Spanish food, and more! Please contact Mr. Malle for more information..");
        }if(myItemSelected == "Spanish Cinema Club"){
            myTextView.setText("No description available, please contact Mrs. Muniz-Peredo for more information.");
        }if(myItemSelected == "Speech and Debate"){
            myTextView.setText("No description available, please contact Mrs. Wilson or Mrs. Craven for more information.");
        }if(myItemSelected == "Spring Play"){
            myTextView.setText("The spring play is an organized extracurricular activity, usually guided by a teacher and outside directors. It is extremely fun with everyone interacting, learning, acting, reacting, and growing as a group. This well-organized club always produces a great product from great group effort.");
        }if(myItemSelected == "Student Council"){
            myTextView.setText("Class representatives and class officers are elected during the fourth 9-Weeks to represent their grade for the remainder of the school year and the first three 9-Weeks of the following school year. Activities include planning events to boost school spirit, organizing fundraisers, and facilitating communication between students and faculty.\n" +
                    "\n" +
                    "Meetings are held every Friday, 7:30 -8:00 am in the FC LGI Room. Please confirm specific meeting dates and times with the club sponsor.");
        }if(myItemSelected == "Students for Life"){
            myTextView.setText("Zionsville Students for Life's main goal is to promote and protect life for everyone. We spread awareness about abortion and provide comfort for those in need. Our hope is to make a positive difference for the pro-life community in Zionsville.");
        }if(myItemSelected == "Swing Dance Club"){
            myTextView.setText("Students meet two Fridays a month in Mrs. Busick's room 411 and learn dances from the 1930's through the 1950's.  Please confirm specific meeting dates and times with the club sponsor.");
        }if(myItemSelected == "Timmy Club"){
            myTextView.setText("No description available, please contact Mrs. Bing for more information.");
        }if(myItemSelected == "Tri M Music Honor Society"){
            myTextView.setText("No description available, please contact Mrs. Barry for more information.");
        }if(myItemSelected == "Varsity Dance Team"){
            myTextView.setText("The ZCHS Varsity Dance Team performs hip hop and pom routines at football and basketball games. The team is selected at open auditions in March and practices begin in June. The dancers also perform at parades and special events with a focus on volunteering for fundraisers like Ovarian Cancer Research, Breast Cancer Research, mentoring area youth dancers and raising money for the Marching Eagles. We only hold auditions once a year and, due to uniform and time limitations, cannot take dancers mid season. Please email the coach for specific information.");
        }if(myItemSelected == "Winter Guard"){
            myTextView.setText("No description available, please contact Mr. Landrum for more information.");
        }if(myItemSelected == "Women in Engineering"){
            myTextView.setText("No description available, please contact Mrs. Carter for more information.");
        }if(myItemSelected == "Yearbook"){
            myTextView.setText("No description available, please contact Mrs. Wagner for more information.");
        }if(myItemSelected == "Yoga Club"){
            myTextView.setText("No description available, please contact Ms. Chickedantz for more information.");
        }if(myItemSelected == "Young Democrats"){
            myTextView.setText("Young Democrats works to preserve open debate, foster an environemnet for discussion, inform the students of ZCHS on sociopolitical issues, and provide a safe space for the Democrats within the student body to share their beliefs in their community We reguarly have guest speakers. Meetings are on the 1st and 3rd Thursday of every month. Please contact Ms. Chickedantz or Ms. Thornley for more information.");
        }if(myItemSelected == "Young Republicans"){
            myTextView.setText("No description available at this time.");
        }if(myItemSelected == "Zionsville Sports Network"){
            myTextView.setText("No description available, please contact Mr. Schellhase for more information.");
        }if(myItemSelected == "Zionsville Student Ambassadors"){
            myTextView.setText("No description available at this time.");
        }if(myItemSelected == "ZPAC Crew"){
            myTextView.setText("The ZPAC Crew puts on various productions and shows at ZCHS's perfoming arts center. Members of the crew handle the technical aspects of theatre (lights, sound, rigging, projection, etc.). Interested students should contact Rachel Vining at rvining@zcs.k12.in.us.");
        }if(myItemSelected == "Zumba Club"){
            myTextView.setText("No description available at this time.");
        }



    }
}
