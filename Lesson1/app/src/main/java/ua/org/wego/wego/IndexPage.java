package ua.org.wego.wego;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IndexPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }


    }


    public class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            String[] data = {
                    "Erasmus Ortiz	0966 328 8486","Oscar Beach	055 1818 3375","Addison Acevedo	0845 46 48","Alden Travis	0927 077 0325","Hall Santiago	055 5872 1035","Allen Phillips	07624 141875","Allen Newman	0500 702604","Beau Meadows	(016977) 8568","Knox Hester	055 5734 2291","Price Middleton	(021) 6357 3931","Keane Moon	070 9652 7094","Hakeem Glover	076 8956 7282","Giacomo Roman	(01787) 699540","Rigel Morse	0800 1111","Hamish Watkins	0846 471 8298","Isaiah Cabrera	(01719) 220646","Rahim Pearson	0800 1111","Carlos Valenzuela	0800 395130","Honorato Jennings	056 5903 2251","Rafael Bird	07485 318762","Armand Houston	07317 723553","Donovan Hudson	07624 201543","Alexander Mayer	070 4832 8292","Amal Cook	(0111) 880 9154","Jordan Cash	076 0529 6966","Lane Garner	0800 1111","Hunter Carver	0800 1111","Caesar Navarro	0500 794577","Geoffrey Galloway	055 4939 3834","Clinton Strickland	(016977) 3961","Jordan Murphy	(024) 7389 2481","Fletcher Ortega	056 8646 7616","Len Britt	(01515) 370630","Keegan Blake	(01129) 524841","David Mccray	(0116) 909 4651","Price Gould	(0113) 702 6594","Slade Norris	0831 715 0028","Jackson Moss	055 8161 1515","Chase Mcneil	076 1311 6993","Luke Beck	(015033) 06539","Mason Lott	0500 766981","Thomas Riddle	070 4015 8601","Clinton Ballard	0399 505 3758","Luke Vasquez	0800 314 6554","Ivor Potts	07624 524766","Oscar Fulton	(014578) 74176","Zachary Short	(016977) 9220","Macaulay Bright	055 4688 6094","Porter Macdonald	(021) 1557 5005","Damian Ramirez	07624 909918","Chaim Johnson	055 0384 1402","Carter Lindsey	(0113) 074 8397","Buckminster Carey	0941 056 5853","Quamar Brooks	0800 259370","Gage Walters	0845 46 43","Abraham Mitchell	07624 167100","Lars Guthrie	0978 852 8797","Sylvester Collins	076 7437 6488","Patrick Russo	07624 399353","Brenden Howard	0800 320589","Roth Mayo	(01836) 20490","Stuart Mathews	07624 261401","Harding Conrad	0800 191 8843","Tiger Contreras	0800 618 2118","Lev Mcconnell	0845 46 44","Abel Kirkland	(016977) 3239","Alden Compton	0809 660 9499","Linus Johnston	(027) 9161 9063","Logan Kirkland	(01821) 72346","Kennedy Crane	0800 898393","Hammett Rojas	07578 062507","Oscar Stout	07624 820279","Omar Lara	07212 989309","Gary Cook	070 4218 3537","Tanek Oliver	0845 46 43","Maxwell Ware	07624 406035","Guy Blackburn	055 4161 4164","Dorian Hudson	0972 414 0568","Xanthus Morales	0800 1111","Colby Mcfadden	0800 761300","Ciaran Russo	0845 46 46","Byron Ball	076 6250 9102","Macon Salazar	0897 957 1213","Sebastian Jimenez	(0114) 762 1417","Carl Bright	0800 416640","Prescott Chapman	(016487) 07127","Wade Fletcher	07166 345524","Nissim Mays	0828 885 6558","Howard Bowen	0845 46 40","Nigel Walls	0500 041792","Ezra Kirkland	(01947) 22047","Denton Newton	056 5701 2708","Gareth Mercado	(015799) 11046","Davis Rivas	0500 823591","Zeph Marks	(01622) 378444","Noble Hahn	055 3469 0350","Jasper Neal	0800 994116","Cameron Aguilar	(012182) 62474","Len Fisher	(0101) 049 1082","Oliver Bartlett	(029) 8906 1693"
            };

            List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
            ArrayAdapter<String> forecastAdapter =
                    new ArrayAdapter<String>(
                            getActivity(),
                            R.layout.list_item_forecast,
                            R.id.list_item_forecast_textview,
                            weekForecast);

            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            ListView FirstList = (ListView) rootView.findViewById(R.id.listview_forecast);
            FirstList.setAdapter(forecastAdapter);
            return rootView;

        }
    }

}