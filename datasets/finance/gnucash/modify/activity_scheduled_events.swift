import SwiftUI
struct activity_scheduled_events: View {
    
    var body: some View {
        NavigationView
        {
            HStack
            {
                NavigationView
                {
                    ZStack
                    {
                        ProgressView()
                            .frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)
                        Rectangle()
                            .fill(Color.white)
                            .frame(minWidth:0,maxWidth:.infinity)
                    }
                    .frame(minWidth:0,maxWidth:.infinity)
                    HStack
                    {
                        Text("")
                    }
                    .frame(minWidth:0,maxWidth:.infinity)
                    .background(Color.white)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                Rectangle()
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            Rectangle()
                .frame(minHeight:0,maxHeight:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_scheduled_events_Previews: PreviewProvider {
    static var previews: some View {
        activity_scheduled_events()
    }
}
