import SwiftUI
struct activity_reports: View {
    
    var body: some View {
        NavigationView
        {
            ZStack
            {
                VStack
                {
                    ScrollView
                    {
                        ZStack
                        {
                            ZStack
                            {
                                ProgressView()
                                    .frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)
                                VStack
                                {
                                    List
                                    {
                                        ForEach(1..<10)
                                        {
                                            index in
                                            Text("Item \(index)")
                                        }
                                    }
                                    .listStyle(PlainListStyle())
                                }
                              
                                .frame(minWidth:0,maxWidth:.infinity)
                            }
                            .frame(minWidth:0,maxWidth:.infinity)
                            ZStack
                            {
                                Text("")
                            }
                            .frame(minWidth:0,maxWidth:.infinity)
                        }
                        .frame(minWidth:0,maxWidth:.infinity)
                    }
                    .frame(minWidth:0,maxWidth:.infinity)
                    Rectangle()
                        .fill(Color.white)
                        .frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
                        .padding(.top,5)
                }
                HStack
                {
                    Text("Period:")
                        .frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
                        .font(.system(size: 14))
                    Rectangle()
                        .fill(Color.white)
                        .frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
                    List
                    {
                        ForEach(1..<10)
                        {
                            index in
                            Text("Item \(index)")
                        }
                    }
                    .frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
                    .listStyle(PlainListStyle())
                    .padding(.leading,5)
                    .padding(.leading,5)
                }
                .frame(minWidth:0,maxWidth:.infinity,minHeight:120,idealHeight:120)
                .padding(10)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            Rectangle()
                .frame(minHeight:0,maxHeight:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_reports_Previews: PreviewProvider {
    static var previews: some View {
        activity_reports()
    }
}
