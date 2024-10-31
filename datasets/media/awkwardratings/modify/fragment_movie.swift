import SwiftUI
struct fragment_movie: View {
    
    var body: some View {
        ZStack
        {
            ScrollView
            {
                ZStack
                {
                    Image("large_backdrop")
                     
                        .frame(minWidth:0,maxWidth:.infinity,minHeight:23,idealHeight:23)
                        
                    Button(action: {})
                    {
                        Text("null")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:200,idealHeight:200)
                    
                    VStack
                    {
                        HStack
                        {
                            Image("ic_play")
                                .frame(minWidth:108,idealWidth:108,minHeight:160,idealHeight:160)
                            
                            VStack
                            {
                                Text("Best Movie Ever")
                                    .font(.system(size: 22))
                                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                              
                                //update
                                Text("October 2014 119 minutes")
                                    .font(.system(size: 15))
                                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                                 
                            }
                            .frame(minWidth:0,maxWidth:.infinity)
                            .padding(.top,40)
                            .padding(.leading,16)
                            .padding(.trailing,16)
                        }
                        .frame(minWidth:0,maxWidth:.infinity)
                        ZStack
                        {
                            HStack
                            {
                                Button(action: {})
                                {
                                    Text("NOT")
                                        .foregroundColor(.black)
                                }
                                .frame(minWidth:56,idealWidth:56,minHeight:56,idealHeight:56)
                              
                                HStack
                                {
                                    Button(action: {})
                                    {
                                        Text("null")
                                            .foregroundColor(.black)
                                    }
                                    .frame(minWidth:56,idealWidth:56,minHeight:56,idealHeight:56)
                                   
                                    .padding(.leading,32)
                                    .padding(.trailing,32)
                                    Button(action: {})
                                    {
                                        Text("AWK")
                                            .foregroundColor(.black)
                                    }
                                    .frame(minWidth:56,idealWidth:56,minHeight:56,idealHeight:56)
                                   
                                }
                            }
                        }
                        .frame(minWidth:0,maxWidth:.infinity)
                        .padding(.top,16)
                        Text("awkward")
                            .padding(.top,2)
                            
                        HStack
                        {
                            ZStack(){}
                            //.fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
                                .frame(minHeight:1,idealHeight:1)
                                .padding(.top,16)
                                .padding(.bottom,16)
                                .padding(.trailing,16)
                            Text("K E Y W O R D S")
                               
                            Rectangle()
                                .fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
                                .frame(minHeight:1,idealHeight:1)
                                .padding(.top,16)
                                .padding(.bottom,16)
                                .padding(.leading,16)
                        }
                        .frame(minWidth:0,maxWidth:.infinity)
                        Text("times square, superhero, long take, new york city, play, broadway, death of superhero, actor")
                            .frame(minWidth:0,maxWidth:.infinity)
                            .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                          
                        HStack
                        {
                            Rectangle()
                                .fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
                                .frame(minHeight:1,idealHeight:1)
                                .padding(.top,16)
                                .padding(.bottom,16)
                                .padding(.trailing,16)
                            Text("O V E R V I E W")
                               
                            Rectangle()
                                .fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
                                .frame(minHeight:1,idealHeight:1)
                                .padding(.top,16)
                                .padding(.bottom,16)
                                .padding(.leading,16)
                        }
                        .frame(minWidth:0,maxWidth:.infinity)
                        Text("A story about love, passion, and plenty of explosions, the Robot Man finds his way through time to stop the evil aliens from taking over Russia.")
                            .frame(minWidth:0,maxWidth:.infinity)
                            .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                         
                    }
                    .frame(minWidth:0,maxWidth:.infinity)
                    .padding(.top)
                    .padding(16)
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            //Rectangle()
            //.frame(minWidth:0,maxWidth:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_movie_Previews: PreviewProvider {
    static var previews: some View {
        fragment_movie()
    }
}
